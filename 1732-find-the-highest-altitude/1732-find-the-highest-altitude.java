class Solution {
    public int largestAltitude(int[] gain) {
        
        int PeakAltitude = 0;
        int CurrAltitude = 0;
        
        for (int i = 0; i < gain.length; i++){
            
            CurrAltitude = CurrAltitude + gain[i];
            
            PeakAltitude = Math.max(PeakAltitude, CurrAltitude);
        }
        
        return PeakAltitude;
        
    }
}