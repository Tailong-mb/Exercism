class NaturalNumber {
            
            private int nombre;
            
            public NaturalNumber(int nombre){
                int sum = 0;
                int test;

                if(nombre < 1)
                    throw new IllegalArgumentException("You must supply a natural number (positive integer)");
                else 
                    this.nombre = nombre;
                
            }

    
            Classification getClassification(){
                    int sum = 0;
                    int test;
                
                    for(int i = 1; i < this.nombre ;i++){
                    test = this.nombre%i;
                        
                    if(test == 0)
                        sum += i;
                }

                if (sum > this.nombre)
                    return Classification.ABUNDANT;
                else if (sum < this.nombre)
                    return Classification.DEFICIENT;
                else
                    return Classification.PERFECT;
            }
}
