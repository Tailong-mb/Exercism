export class Triangle {
  
  firstSide : number;
  secondSide : number;
  thirdSide : number;
  
  constructor(...sides : number[]) {
    this.firstSide = sides[0];
    this.secondSide = sides[1];
    this.thirdSide = sides[2];
  }

  get isEquilateral(): boolean {
    if(!this.validTriangle())
      return false;
    
    return this.firstSide === this.secondSide && this.thirdSide === this.firstSide;
  }

  get isIsosceles(): boolean{
    if(!this.validTriangle())
      return false;
    
    return this.firstSide === this.secondSide ||
      this.thirdSide === this.firstSide ||
      this.secondSide === this.thirdSide;
  }

  get isScalene() {
    if(!this.validTriangle())
      return false;
    
    return !(this.isIsosceles || this.isEquilateral);
  }

 validTriangle():boolean {
    if(this.firstSide === 0 ||
      this.secondSide === 0 ||
      this.thirdSide === 0)
      return false

    return !((this.firstSide + this.secondSide) < this.thirdSide ||
            (this.thirdSide + this.secondSide) < this.firstSide ||
            (this.firstSide + this.thirdSide) < this.secondSide)
  }
}
