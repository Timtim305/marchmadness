package Network;

import java.util.HashMap;


public class Driver {
	static HashMap<String, double[]> teams = new HashMap<String, double[]>();

	public static void initializeTeams() {
		
		// we need to initialize this HashMap to make looking up teams easy
		teams.put("Villanova", new double[] { 2, 35.0, .9633, 122.5, 92.2, 66.5, .023, .7374, 108.9, 99.6, .5853 });
		teams.put("UNC", new double[] { 1, 33.0, .9522, 124.1, 95.6, 71.1, -.055, .7473, 110.0, 100.2, .5574 });
		teams.put("Virginia", new double[] { 1, 29.0, .9499, 118.5, 91.7, 61.9, -.040, .7692, 110.6, 99.6, .6184 });
		teams.put("Kansas", new double[] { 1, 33.0, .9480, 117.7, 91.5, 69.9, .044, .7534, 109.5, 99.4, .5582 });
		teams.put("Michigan State",
				new double[] { 2, 29.0, .9237, 121.7, 98.0, 67.5, -.012, .6362, 105.3, 100.4, .4796 });
		teams.put("Kentucky", new double[] { 4, 27.0, .9141, 120.4, 98.0, 68.0, -.046, .6826, 106.9, 100.1, .5932 });
		teams.put("Oklahoma", new double[] { 2, 29.0, .9111, 116.2, 94.9, 70.4, .082, .7666, 109.7, 98.9, .5484 });
		teams.put("Wichita State",
				new double[] { 11, 26.0, .9110, 107.7, 88.0, 66.9, -.079, .5760, 103.3, 100.6, .6364 });
		teams.put("West Virginia", new double[] { 3, 26.0, .9069, 112.7, 92.5, 70.5, .004, .7422, 109.3, 99.7, .5332 });
		teams.put("Xavier", new double[] { 2, 28.0, .9031, 115.6, 95.2, 72.6, .047, .6910, 106.8, 99.6, .5194 });
		teams.put("Oregon", new double[] { 1, 31.0, .9022, 117.7, 97.0, 68.7, .041, .6875, 107.1, 100.0, .5064 });
		teams.put("Miami", new double[] { 3, 27.0, .8966, 117.8, 97.6, 66.5, .077, .7568, 110.0, 99.7, .5356 });
		teams.put("Purdue", new double[] { 5, 26.0, .8952, 114.6, 95.1, 68.5, -.046, .6459, 107.1, 101.7, .4283 });
		teams.put("Indiana", new double[] { 5, 27.0, .8942, 119.5, 99.2, 69.2, .000, .6337, 107.1, 102.1, .4227 });
		teams.put("Iowa State", new double[] { 4, 23.0, .8878, 120.4, 100.6, 72.0, -.062, .7381, 108.1, 98.7, .5047 });
		teams.put("Gonzaga", new double[] { 11, 28.0, .8846, 114.0, 95.5, 68.0, -.038, .5709, 105.8, 103.2, .6065 });
		teams.put("Texas A&M", new double[] { 3, 28.0, .8793, 111.6, 93.9, 68.1, .007, .6712, 107.7, 101.2, .5515 });
		teams.put("Duke", new double[] { 4, 25.0, .8756, 119.3, 100.7, 68.6, -.026, .7430, 110.4, 100.7, .5668 });
		teams.put("Arizona", new double[] { 6, 25.0, .8722, 114.7, 97.0, 69.1, -.038, .6206, 105.8, 101.3, .3869 });
		teams.put("Seton Hall", new double[] { 6, 25.0, .8717, 109.6, 92.8, 70.5, .016, .7026, 107.2, 99.4, .4398 });
		teams.put("Iowa", new double[] { 7, 22.0, .8641, 113.8, 96.9, 69.7, -.071, .6898, 108.4, 101.1, .5232 });
		teams.put("Syracuse", new double[] { 10, 23.0, .8625, 111.0, 94.6, 65.6, -.027, .7319, 109.5, 100.4, .4903 });
		teams.put("Maryland", new double[] { 5, 27.0, .8613, 113.4, 96.7, 68.0, .017, .6824, 107.4, 100.5, .4793 });
		teams.put("UConn", new double[] { 9, 25.0, .8596, 110.1, 94.0, 66.4, -.036, .6204, 105.7, 101.3, .4605 });
		teams.put("Stephen F. Austin",
				new double[] { 14, 28.0, .8549, 111.1, 95.2, 68.1, .008, .3851, 102.7, 107.0, .6287 });
		teams.put("Baylor", new double[] { 5, 22.0, .8526, 116.7, 100.2, 67.4, -.012, .7295, 107.8, 98.9, .4477 });
		teams.put("California", new double[] { 4, 23.0, .8463, 110.0, 94.8, 68.8, -.053, .6552, 107.6, 101.7, .4495 });
		teams.put("VCU", new double[] { 10, 25.0, .8405, 110.0, 95.2, 69.9, -.070, .5878, 106.2, 102.9, .5035 });
		teams.put("Vanderbilt", new double[] { 11, 19.0, .8391, 111.3, 96.4, 68.6, -.105, .6878, 107.5, 100.4, .6083 });
		teams.put("Butler", new double[] { 9, 22.0, .8359, 116.2, 100.9, 69.0, -.008, .6753, 107.0, 100.4, .4054 });
		teams.put("Wisconsin", new double[] { 7, 22.0, .8334, 107.3, 93.3, 64.1, -.022, .7048, 108.6, 100.7, .5465 });
		teams.put("Cincinatti", new double[] { 9, 22.0, .8329, 108.8, 94.6, 65.5, -.067, .6095, 105.7, 101.7, .4757 });
		teams.put("Notre Dame", new double[] { 6, 24.0, .8305, 119.1, 103.7, 65.2, .055, .7264, 109.5, 100.6, .4549 });
		teams.put("Texas", new double[] { 6, 20.0, .8269, 111.5, 97.3, 66.4, .022, .7552, 109.6, 99.3, .5916 });
		teams.put("Saint Joseph", new double[] { 8, 28.0, .8263, 113.7, 99.3, 70.9, .031, .6070, 105.7, 101.8, .5386 });
		teams.put("Utah", new double[] { 3, 27.0, .8225, 113.1, 99.0, 66.4, .112, .6864, 107.5, 100.4, .5107 });
		teams.put("Yale", new double[] { 12, 23.0, .8135, 108.7, 95.7, 66.6, .027, .4999, 104.9, 104.9, .5021 });
		teams.put("Pittsburgh", new double[] { 10, 21.0, .8133, 111.6, 98.2, 66.0, -.011, .6953, 109.3, 101.7, .3248 });
		teams.put("Providence", new double[] { 9, 24.0, .8129, 108.3, 95.3, 69.1, .063, .6976, 108.1, 100.5, .4243 });
		teams.put("Arkansas Little Rock",
				new double[] { 12, 30.0, .789, 108.1, 96.4, 64.0, .056, .4908, 103.4, 103.8, .4820 });
		teams.put("Texas Tech", new double[] { 8, 19.0, .7828, 112.1, 00.3, 66.6, .029, .7252, 108.6, 99.8, .4820 });
		teams.put("USC", new double[] { 8, 21.0, .7714, 111.9, 100., 71.7, -.028, .6482, 106.7, 101.2, .4478 });
		teams.put("Hawaii", new double[] { 13, 28.0, .7687, 106.5, 96.0, 71.3, .013, .4316, 101.4, 103.9, .2902 });
		teams.put("Michigan", new double[] { 11, 23.0, .7622, 111.6, 100.9, 66.4, .013, .6639, 107.8, 101.6, .4496 });
		teams.put("Dayton", new double[] { 7, 25.0, .7590, 103.9, 94.0, 68.7, .082, .5864, 106.0, 102.9, .5354 });
		teams.put("Tulsa", new double[] { 11, 20.0, .7519, 110.0, 99.9, 69.2, -.003, .6127, 105.1, 101.0, .5031 });
		teams.put("Colorado", new double[] { 8, 22.0, .7507, 106.1, 96.4, 69.8, .015, .6467, 107.6, 102.1, .4357 });
		teams.put("Northern Iowa",
				new double[] { 11, 23.0, .7426, 107.2, 97.7, 63.4, .013, .6086, 104.5, 100.6, .6707 });
		teams.put("Oregon State", new double[] { 7, 19.0, .7371, 108.6, 99.3, 68.2, .043, .7035, 108.0, 100.2, .5272 });
		teams.put("UNC Wilmington",
				new double[] { 13, 25.0, .7181, 109.8, 101.2, 70.8, .034, .5240, 104.6, 103.8, .4071 });
		teams.put("South Dakota State",
				new double[] { 12, 26.0, .7122, 109.5, 101.2, 68.8, .005, .4973, 103.5, 103.6, .5527 });
		teams.put("Temple", new double[] { 10, 21.0, .7018, 104.9, 97.4, 66.7, .095, .6365, 106.3, 101.2, .5814 });
		teams.put("Iona", new double[] { 13, 22.0, .6950, 109.6, 102.0, 72.2, -.005, .4629, 103.0, 104.3, .6215 });
		teams.put("Stony Brook", new double[] { 13, 26.0, .6834, 105.2, 98.4, 67.6, .049, .3997, 103.4, 107.1, .6384 });
		teams.put("Cal St. Bakersfield",
				new double[] { 15, 24.0, .6752, 102.7, 96.4, 68.4, -.002, .3439, 100.0, 105.8, .4318 });
		teams.put("Fresno State",
				new double[] { 14, 25.0, .6488, 106.2, 100.7, 69.7, .085, .5227, 103.9, 103.1, .4460 });
		teams.put("Middle Tennesse",
				new double[] { 15, 25.0, .6277, 104.3, 99.7, 68.2, .088, .4879, 104.7, 105.1, .5447 });
		teams.put("Chattanooga",
				new double[] { 12, 29.0, .6225, 105.1, 100.6, 67.1, .132, .4377, 103.9, 106.2, .5183 });
		teams.put("Green Bay", new double[] { 14, 23.0, .6016, 107.3, 103.5, 76.7, .057, .5074, 103.4, 103.1, .5529 });
		teams.put("UNC Asheville",
				new double[] { 15, 22.0, .5900, 102.1, 99.0, 70.9, -.008, .4153, 103.1, 106.2, .5825 });
		teams.put("Buffalo", new double[] { 14, 20.0, .5674, 105.1, 102.6, 73.1, .044, .5377, 105.8, 104.4, .5623 });
		teams.put("Weber State",
				new double[] { 15, 26.0, .5528, 101.9, 100.0, 67.6, .020, .3644, 102.7, 107.8, .5260 });
		teams.put("Florida Gulf Coast",
				new double[] { 16, 21.0, .4961, 102.9, 103.0, 67.6, -.038, .3912, 104.0, 108.0, .4758 });
		teams.put("Austin Peay",
				new double[] { 16, 18.0, .3801, 104.5, 109.1, 70.6, .060, .4465, 104.5, 106.5, .5251 });
		teams.put("Hampton", new double[] { 16, 21.0, .3446, 99.6, 105.3, 71.9, .157, .3174, 99.4, 106.3, .5702 });
		teams.put("Southern University",
				new double[] { 16, 22.0, .3413, 99.3, 105.1, 69.7, .040, .3120, 98.9, 106.0, .5816 });
		teams.put("Holy Cross", new double[] { 16, 15.0, .2692, 96.7, 105.5, 64.3, .064, .3855, 101.9, 106.1, .4036 });
		teams.put("Farleigh Dickinson",
				new double[] { 16, 18, .2658, 104.7, 114.3, 72.5, +.097, .3173, 99.1, 105.9, .5637 });
	}

	static double fire[] = new double[15];

	static double biasMatrix[] = new double[15];

	static double matrix[] = new double[36];

	
	public static double[] getOutput(double input[]) {
		// update the weights
		update();
		int firstLayer = NeuralNetwork.inputAmt; // 11 neurons
		int secondLayer = NeuralNetwork.inputAmt + NeuralNetwork.hiddenCount; 

		for (int i = 0; i < 11; i++) {
			fire[i] = input[i];
		}

		int layer1 = 0;

		for (int i = firstLayer; i < secondLayer; i++) {
			double sum = biasMatrix[i];

			for (int j = 0; j < 11; j++) {
				sum += fire[j] * matrix[layer1++];
			}
			fire[i] = NeuralNetwork.stepF(sum);
		}
		double result[] = new double[1];

		for (int i = secondLayer; i < 15; i++) {
			double sum = biasMatrix[i];

			for (int j = firstLayer; j < secondLayer; j++) {
				sum += fire[j] * matrix[layer1++];
			}
			fire[i] = NeuralNetwork.stepF(sum);
			result[i - secondLayer] = fire[i];
		}
		
		// this is the result
		return result;
	}

	public static void update() {
		// to update, we first initialize the HashMap
		Driver.initializeTeams();
		double[] upset1 = new double[11];
		double[] reverseupset1 = new double[11];
		double[] upset2 = new double[11];
		double[] reverseupset2 = new double[11];
		double[] UNCvSyracuse = new double[11];
		double[] UNCvSyracuseRev = new double[11];
		double[] UKvIU = new double[11];
		double[] IUvUK = new double[11];
		double[] SUvDAYTON = new double[11];
		double[] WICHITAvVanderbilt = new double[11];
		double[] VanderbiltvWICHITA = new double[11];
		double[] DAYTONvSU = new double[11];
		double[] OklahomavOregon = new double[11];
		double[] OregonvOklahoma = new double[11];
		double[] DukevYale = new double[11];
		double[] YalevDuke = new double[11];
		double[] DukevOregon = new double[11];
		double[] OregonvDuke = new double[11];
		double[] YalevBaylor = new double[11];
		double[] BaylorvYale = new double[11];
		double[] HolyCrossvSouthern = new double[11];
		double[] SouthernvHolyCross = new double[11];
		double[] LittleRockvPurdue = new double[11];
		double[] PurduevLittleRock = new double[11];
		double[] WisconsinvNotreDame = new double[11];
		double[] NotreDamevWisconsin = new double[11];
		double[] SyracusevVirginia = new double[11];
		double[] VirginiavSyracuse = new double[11];
		double[] DukevWilmington = new double[11];
		double[] AustinPeayvKansas = new double[11];
		double[] TexasvUNI = new double[11];
		double[] OUvCSU = new double[11];
		double[] IUvChattanooga = new double[11];
		double[] WiscvPitt = new double[11];
		double[] IowavALR = new double[11];
		double[] IowavALR2 = new double[11];
		double[] SYRvZAGA = new double[11];
		double[] UVAvTT = new double[11];
		double[] NDvSFA = new double[11];
		double[] NDvSFA2 = new double[11];
		double[] TTvButler = new double[11];
		double[] UConnvColorado = new double[11];
		double[] MiddleOffset = new double[11];
		double[] OregonvSJ = new double[11];
		double[] UVAvSYR = new double[11];
		double[] ArizonavWichita = new double[11];
		double[] UNCvFGCU = new double[11];
		double[] VillanovaVUNCA = new double[11];
		
		// give it training data
		for (int i = 0; i < 11; i++) {
			upset1[i] = teams.get("Middle Tennesse")[i] - teams.get("Michigan State")[i];
			reverseupset1[i] = teams.get("Michigan State")[i] - teams.get("Middle Tennesse")[i];
			upset2[i] = teams.get("Gonzaga")[i] - teams.get("Syracuse")[i];
			reverseupset2[i] = teams.get("Syracuse")[i] - teams.get("Gonzaga")[i];
			UNCvSyracuse[i] = teams.get("UNC")[i] - teams.get("Syracuse")[i];
			UNCvSyracuseRev[i] = teams.get("Syracuse")[i] - teams.get("UNC")[i];
			UKvIU[i] = teams.get("Kentucky")[i] - teams.get("Indiana")[i];
			IUvUK[i] = teams.get("Indiana")[i] - teams.get("Kentucky")[i];
			SUvDAYTON[i] = teams.get("Syracuse")[i] - teams.get("Dayton")[i];
			DAYTONvSU[i] = teams.get("Dayton")[i] - teams.get("Syracuse")[i];
			WICHITAvVanderbilt[i] = teams.get("Wichita State")[i] - teams.get("Vanderbilt")[i];
			VanderbiltvWICHITA[i] = teams.get("Vanderbilt")[i] - teams.get("Wichita State")[i];
			OklahomavOregon[i] = teams.get("Oklahoma")[i] - teams.get("Oregon")[i];
			OregonvOklahoma[i] = teams.get("Oregon")[i] - teams.get("Oklahoma")[i];
			DukevYale[i] = teams.get("Duke")[i] - teams.get("Yale")[i];
			YalevDuke[i] = teams.get("Yale")[i] - teams.get("Duke")[i];
			DukevOregon[i] = teams.get("Duke")[i] - teams.get("Oregon")[i];
			OregonvDuke[i] = teams.get("Oregon")[i] - teams.get("Duke")[i];
			YalevBaylor[i] = teams.get("Yale")[i] - teams.get("Baylor")[i];
			BaylorvYale[i] = teams.get("Baylor")[i] - teams.get("Yale")[i];
			HolyCrossvSouthern[i] = teams.get("Holy Cross")[i] - teams.get("Southern University")[i];
			SouthernvHolyCross[i] = teams.get("Southern University")[i] - teams.get("Holy Cross")[i];
			LittleRockvPurdue[i] = teams.get("Arkansas Little Rock")[i] - teams.get("Purdue")[i];
			PurduevLittleRock[i] = teams.get("Purdue")[i] - teams.get("Arkansas Little Rock")[i];
			WisconsinvNotreDame[i] = teams.get("Wisconsin")[i] - teams.get("Notre Dame")[i];
			NotreDamevWisconsin[i] = teams.get("Notre Dame")[i] - teams.get("Wisconsin")[i];
			SyracusevVirginia[i] = teams.get("Syracuse")[i] - teams.get("Virginia")[i];
			VirginiavSyracuse[i] = teams.get("Virginia")[i] - teams.get("Syracuse")[i];
			AustinPeayvKansas[i] = teams.get("Austin Peay")[i] - teams.get("Kansas")[i];
			DukevWilmington[i] = teams.get("Duke")[i] - teams.get("UNC Wilmington")[i];
			TexasvUNI[i] = teams.get("Texas")[i] - teams.get("Northern Iowa")[i];
			OUvCSU[i] = teams.get("Oklahoma")[i] - teams.get("Cal St. Bakersfield")[i];
			IUvChattanooga[i] = teams.get("Indiana")[i] - teams.get("Chattanooga")[i];
			WiscvPitt[i] = teams.get("Wisconsin")[i] - teams.get("Pittsburgh")[i];
			IowavALR[i] = teams.get("Iowa State")[i] - teams.get("Arkansas Little Rock")[i];
			IowavALR2[i] = teams.get("Arkansas Little Rock")[i] - teams.get("Iowa State")[i];
			SYRvZAGA[i] = teams.get("Syracuse")[i] - teams.get("Gonzaga")[i];
			UVAvTT[i] = teams.get("Virginia")[i] - teams.get("Texas Tech")[i];
			NDvSFA[i] = teams.get("Notre Dame")[i] - teams.get("Stephen F. Austin")[i];
			NDvSFA2[i] = teams.get("Stephen F. Austin")[i] - teams.get("Notre Dame")[i];
			TTvButler[i] = teams.get("Texas Tech")[i] - teams.get("Butler")[i];
			UConnvColorado[i] = teams.get("UConn")[i] - teams.get("Colorado")[i];
			OregonvSJ[i] = teams.get("Oregon")[i] - teams.get("Saint Joseph")[i];
			MiddleOffset[i] = teams.get("Kansas")[i] - teams.get("Middle Tennesse")[i];
			UVAvSYR[i] = teams.get("Virginia")[i] - teams.get("Syracuse")[i];
			ArizonavWichita[i] = teams.get("Arizona")[i] - teams.get("Wichita State")[i];
			UNCvFGCU[i] = teams.get("UNC")[i] - teams.get("Florida Gulf Coast")[i];
			VillanovaVUNCA[i] = teams.get("Villanova")[i] = teams.get("UNC Asheville")[i];
		}

		double TrainingData[][] = { { -1.0, 2.0, .011, -1.6, -3.4, -4.6, .078, -.0079, -1.1, -.6, .0263 },
				{ 1.0, -2.0, -.011, 1.6, 3.4, 4.6, -.078, .0079, 1.1, .6, -.0263 },
				{ -5, 9.0, .1217, 5.0, -8.1, 5.9, -.10, .027, .5, -.4, .1025 },
				{ 5, -9.0, +.1217, -5.0, +8.1, -5.9, +.10, -.027, -.5, +.4, -.1025 },
				{ -15, -17, -.5679, -13.2, 17.6, .7, .016, -.3069, -5, 7.1, -.0333 },
				{ 15, 17, .5679, 13.2, -17.6, -.7, -.016, .3069, 5, -7.1, .0333 }, upset1, upset2, reverseupset1,
				reverseupset2, UNCvSyracuse, UNCvSyracuseRev, UKvIU, IUvUK, DAYTONvSU, SUvDAYTON, WICHITAvVanderbilt,
				VanderbiltvWICHITA, OklahomavOregon, OregonvOklahoma, DukevYale, YalevDuke, OregonvDuke, DukevOregon,
				YalevBaylor, BaylorvYale, HolyCrossvSouthern, SouthernvHolyCross, LittleRockvPurdue, PurduevLittleRock,
				WisconsinvNotreDame, NotreDamevWisconsin, SyracusevVirginia, VirginiavSyracuse, AustinPeayvKansas,
				DukevWilmington, TexasvUNI, OUvCSU, IUvChattanooga, WiscvPitt, reverseupset1, reverseupset1, upset1,
				IowavALR, IowavALR2, IowavALR, SYRvZAGA, UVAvTT, NDvSFA, NDvSFA2, TTvButler, UConnvColorado,
				MiddleOffset, OregonvSJ, UVAvSYR, reverseupset1, reverseupset1,ArizonavWichita , UNCvFGCU, VillanovaVUNCA };

		double expected[][] = { { 1.0 }, { 0.0 }, { 1.0 }, { 0.0 }, { 0.0 }, { 1.0 }, { 1.0 }, { 0.0 }, { 0.0 },
				{ 1.0 }, { 1.0 }, { 0.0 }, { 0.0 }, { 1.0 }, { 0.0 }, { 1.0 }, { 1.0 }, { 0.0 }, { 1.0 }, { 0.0 },
				{ 1.0 }, { 0.0 }, { 1.0 }, { 0.0 }, { 1.0 }, { 0.0 }, { 1.0 }, { 0.0 }, { 1.0 }, { 0.0 }, { 0.0 },
				{ 1.0 }, { 1.0 }, { 0.0 }, { 0.0 }, { 1.0 }, { 0.0 }, { 0.0 }, { 1.0 }, { 1.0 }, { 0.0 }, { 0.0 },
				{ 1.0 }, { 1.0 }, { 0.0 }, { 1.0 }, { 1.0 }, { 1.0 }, { 1.0 }, { 0.0 }, { 0.0 }, { 1.0 }, { 1.0 },
				{ 1.0 }, { 0.0 } , {0.0} , {0.0}, {0.0} , {1.0} , {1.0} };

		NeuralNetwork network = new NeuralNetwork(11, 3, 1, (Math.random()), (Math.random()));

		for (int i = 0; i < 5000; i++) {
			for (int j = 0; j < TrainingData.length; j++) {
				NeuralNetwork.calcOutput(TrainingData[j]);
				network.getIndividualErrors(expected[j]);
				network.train();
			}
		}

		for (int i = 0; i < NeuralNetwork.weights.length; i++) {
			matrix[i] = NeuralNetwork.weights[i];
		}

		for (int i = 0; i < NeuralNetwork.fireThreshold.length; i++) {
			fire[i] = NeuralNetwork.fireThreshold[i];
		}

		for (int i = 0; i < NeuralNetwork.bias.length; i++) {
			biasMatrix[i] = NeuralNetwork.bias[i];
		}
		
		// the major benefit for re-initializing and re-updating every time we test teams
		// is that although it does take a bit more time, 
		// it gives us a probabilistic model. So there will be fluctuations in results based 
		// on how close the game will be
	}

	public static void main(String[] args) {
		update();
	}
}
