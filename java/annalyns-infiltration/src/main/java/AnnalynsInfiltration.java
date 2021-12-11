class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        boolean SpyPossible = false;
       if(knightIsAwake || archerIsAwake || prisonerIsAwake){
           SpyPossible = true;
       }
           return SpyPossible;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if((!archerIsAwake) && prisonerIsAwake)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if (petDogIsPresent && !archerIsAwake){
            return true;
        }else if (prisonerIsAwake && !knightIsAwake && !archerIsAwake){
            return true;
        }else{
            return false;
        }
    }
}
