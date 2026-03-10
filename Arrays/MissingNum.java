class mssingnum{
    public int main(String[] args) {
        int arr[]={1,2,3,5};
        Arrays.sort(arr);
        int val_chk=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                val_chk=i+1;
                break;
            }
        }   return val_chk;
    }
}
