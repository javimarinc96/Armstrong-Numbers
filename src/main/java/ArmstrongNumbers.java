class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int abs = Math.abs(numberToCheck);
        int sumDigits = 0;
        int size = Integer.toString(abs).length();
        String text = Integer.toString(abs);

        for(int i = 0;i<text.length();i++){
            sumDigits +=             Math.pow(Integer.parseInt(Character.toString(text.charAt(i))),size);
        }

        return sumDigits == numberToCheck;
    }

}
