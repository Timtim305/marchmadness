// Tim Wang
// 2016

package Network;

public class NeuralNetwork {
	double totalError;
	static int inputAmt;
	static int hiddenCount;
	static int outputCount;
	static int neurons;
	int weightAmt;

	double learningRate;
	double momentum;
	static double fireThreshold[];
	static double weights[];
	static double bias[];

	double errors[];
	static double dxdxMatrix[];
	static double dxWeights[];
	static double dxdxBias[];
	static double dxBias[];
	double errorDelta[];

	public NeuralNetwork(int inputAmt, int hiddenCount, int outputCount, double learningRate, double momentum) {

		// here we initialize everything
		this.learningRate = learningRate;
		this.momentum = momentum;

		NeuralNetwork.inputAmt = inputAmt;
		NeuralNetwork.hiddenCount = hiddenCount;
		NeuralNetwork.outputCount = outputCount;

		// total neurons are all neurons in input, hidden, and output layers
		neurons = inputAmt + hiddenCount + outputCount;
		weightAmt = (inputAmt * hiddenCount) + (hiddenCount * outputCount);

		// set each matrix according to the objects they interact with
		fireThreshold = new double[neurons];
		weights = new double[weightAmt];
		dxWeights = new double[weightAmt];
		bias = new double[neurons];
		errorDelta = new double[neurons];
		errors = new double[neurons];
		dxdxBias = new double[neurons];
		dxdxMatrix = new double[weightAmt];
		dxBias = new double[neurons];

		// after everything has been initialized, reset everything
		resetAll();
	}

	public static void resetAll() {
		// set weights to a random number
		// sets everything that affects weight to 0
		for (int i = 0; i < weights.length; i++) {
			dxWeights[i] = 0;
			dxdxMatrix[i] = 0;
			weights[i] = (Math.random());
		}

		// sets bias to random number
		// anything that affects threshold is set to 0
		for (int i = 0; i < neurons; i++) {
			dxBias[i] = 0;
			dxdxBias[i] = 0;
			bias[i] = (Math.random());
		}

	}

	// calculates root means squared
	public double getRMS(int total) {
		double error = Math.sqrt(totalError / (total * outputCount));
		totalError = 0; // clear the accumulator
		return error;
	}

	// The step function
	// basically sets result to 0 or 1
	public static double stepF(double total) {
		return (1.0 / (1 + Math.pow(2, -1.0 * total)));
	}

	// this computes the result
	// notice that data dealing with first and hidden layers are stored in the
	// same array so we must differentiate
	public static double[] calcOutput(double input[]) {
		int breakLine = inputAmt + hiddenCount;

		// initialize fireThreshold so it can be updated
		for (int i = 0; i < inputAmt; i++) {
			fireThreshold[i] = input[i];
		}

		// first layer
		int layer1 = 0;

		for (int i = inputAmt; i < breakLine; i++) {
			double total = bias[i];

			for (int j = 0; j < inputAmt; j++) {
				total += fireThreshold[j] * weights[layer1++];
			}
			// does this fireThreshold or not
			fireThreshold[i] = stepF(total);
		}

		// now time for the hidden layer
		double result[] = new double[outputCount];

		// notice we start from the break and go to the end of the array
		for (int i = breakLine; i < neurons; i++) {
			double total = bias[i];

			for (int j = inputAmt; j < breakLine; j++) {
				total += fireThreshold[j] * weights[layer1++];
			}
			fireThreshold[i] = stepF(total);
			result[i - breakLine] = fireThreshold[i];
		}

		return result;
	}

	public void getIndividualErrors(double expected[]) {
		// secondLayer is just when the second Layer ends
		int secondLayer = inputAmt + hiddenCount;

		// clear hidden numOfLinks errors
		for (int i = inputAmt; i < neurons; i++) {
			errors[i] = 0;
		}

		// numOfLinks errors and deltas for output numOfLinks
		for (int i = secondLayer; i < neurons; i++) {
			errors[i] = expected[i - secondLayer] - fireThreshold[i];
			totalError += errors[i] * errors[i];
			errorDelta[i] = errors[i] * (1 - fireThreshold[i]) * fireThreshold[i];
		}

		// connections between the first and second layers
		int numOfLinks = inputAmt * hiddenCount;

		for (int i = secondLayer; i < neurons; i++) {
			for (int j = inputAmt; j < secondLayer; j++) {
				dxdxMatrix[numOfLinks] += errorDelta[i] * fireThreshold[j];
				errors[j] += weights[numOfLinks] * errorDelta[i];
				numOfLinks++;
			}
			dxdxBias[i] += errorDelta[i];
		}

		// hidden numOfLinks deltas
		for (int i = inputAmt; i < secondLayer; i++) {
			errorDelta[i] = errors[i] * fireThreshold[i] * (1 - fireThreshold[i]);
		}

		numOfLinks = 0;
		for (int i = inputAmt; i < secondLayer; i++) {
			for (int j = 0; j < inputAmt; j++) {
				dxdxMatrix[numOfLinks] += errorDelta[i] * fireThreshold[j];
				errors[j] += weights[numOfLinks] * errorDelta[i];
				numOfLinks++;
			}
			dxdxBias[i] += errorDelta[i];
		}
	}

	public void train() {
		// process the weights
		for (int i = 0; i < weights.length; i++) {
			dxWeights[i] = (momentum * dxWeights[i]) + (learningRate * dxdxMatrix[i]);
			weights[i] += dxWeights[i];
			dxdxMatrix[i] = 0;
		}

		// process the bias
		for (int i = inputAmt; i < neurons; i++) {
			dxBias[i] = learningRate * dxdxBias[i] + (momentum * dxBias[i]);
			bias[i] += dxBias[i];
			dxdxBias[i] = 0;
		}
	}

}