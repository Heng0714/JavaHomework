
public class BSeason {

	public static void main(String[] args) {
		/* 	2.	��ܩʱԭz���m��-Season
				��J���1~12��A�Q��switch�P�_�۹������u�`�K�B�L�B��B�V�æL�X�C�Y���b���d��h�L�X����J���~���C */

		
		int monthInput = 0; // initial value setting
		monthInput = 3; // month input, should from elsewere.
		// End of input
		String seasonOutput;
		String spring = "�K - ���p�@�]�K���ӡA�d���U���ժ�}";
		String summer = "�L- ���U���u���L�n���Ӭy�A�𳱷Ӥ��R���X�C�p���~�S�y�y���A�����f���ߤW�Y";
		String autumn = "��- ���W�H�s�ۮ|�סA�ն��`�B���H�a�C �������R���L�ߡA��������G���";
		String winter = "�V- �d�s�������A�U�|�H�ܷ��C�t��b���ΡA�W���H����";
		switch (monthInput) {
		case 1: seasonOutput = winter;break;
		case 2: seasonOutput = winter;break;
		case 3: seasonOutput = spring;break;
		case 4: seasonOutput = spring;break;
		case 5: seasonOutput = spring;break;
		case 6: seasonOutput = summer;break;
		case 7: seasonOutput = summer;break;
		case 8: seasonOutput = summer;break;
		case 9: seasonOutput = autumn;break;
		case 10: seasonOutput = autumn;break;
		case 11: seasonOutput = autumn;break;
		case 12: seasonOutput = winter;break;
		default: seasonOutput = "��J���~";
		}
		System.out.println(seasonOutput);

	}

}
