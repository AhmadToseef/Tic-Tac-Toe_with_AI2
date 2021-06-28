class Util {

    private static int countForSrc = 0;
    private static int countForTgt = 0;
    private static boolean result = false;

    public static int indexOf(String src, String tgt) {

        if (countForSrc == -1 || countForTgt == -1) {
            return -1;
        }

        if (tgt.length() == 0 || src.length() == 0 || tgt.length() > src.length()) {
            return -1;
        }

        if (countForSrc < src.length() && countForTgt < tgt.length() && src.charAt(countForSrc) == tgt.charAt(countForTgt)) {

            result = true;

            if (tgt.length() == 1) {

                return countForSrc;

            } else if (++countForTgt < tgt.length() && ++countForSrc < src.length()) {

                indexOf(src, tgt);

            } else if (countForTgt < tgt.length()) {

                --countForTgt;
                indexOf(src, tgt);

            }


            return countForSrc - tgt.length() + 1;
//			 return tgt.length() - tgt.length() + 1;

        } else if (countForTgt < tgt.length() && countForSrc < src.length() && src.charAt(countForSrc) != tgt.charAt(countForTgt) && !result) {


            if (result) {

                countForTgt = -1;
                countForSrc = -1;

            } else {


                if (++countForSrc < src.length()) {

                    indexOf(src, tgt);

                } else {

                    countForTgt = -1;
                    countForSrc = -1;
                }


            }

        } else {

            countForSrc = -1;
            countForTgt = -1;
        }

        if (countForSrc != -1) {

            return countForSrc - tgt.length() + 1;
//			 return tgt.length() - tgt.length() + 2;
        } else {
            return -1;
        }

    }
}
