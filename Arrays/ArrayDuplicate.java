class Arrayduplicate {
    public boolean hasDuplicate(int[] numbers) {

        int size = numbers.length;

        for (int first = 0; first < size; first++) {

            for (int second = first + 1; second < size; second++) {

                if (numbers[first] == numbers[second]) {
                    return true;
                }

            }

        }

        return false;
    }
}