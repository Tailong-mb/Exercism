class Triangle {

        private double side1;
        private double side2;
        private double side3;
        private boolean isEqui;
        private boolean isIso;
        private boolean isSca;

    Triangle(double side1, double side2, double side3) throws TriangleException {
        // Test positive values
        if((side1 <= 0) && (side2 <= 0) && (side3 <= 0))
        throw new TriangleException("One or more side have a negative value");
        // Triangular inequality
        if((side1 + side2 < side3) || (side2 + side3 < side1) || (side1 + side3 < side2))
        throw new TriangleException("Triangular inequality");
        
        // Set attributes
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

        //set triangle Type
        
        if((this.side1 == this.side2) && (this.side2 == this.side3)){
            this.isEqui = true;
            this.isIso = true;
            this.isSca = false;
        } else if((this.side1 == this.side2) || (this.side2 == this.side3) || (this.side1 == this.side3)){
            this.isEqui = false;
            this.isIso = true;
            this.isSca = false;
        } else{
            this.isEqui = false;
            this.isIso = false;
            this.isSca = true;
        }

        
    }

    boolean isEquilateral() {
        return this.isEqui;
    }

    boolean isIsosceles() {
        return this.isIso;

    }

    boolean isScalene() {
        return this.isSca;
    }

}
