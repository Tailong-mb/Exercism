export class Gigasecond{

  inPutDate : Date;
  
  public constructor(private readonly inputDate: Date){
    this.inPutDate = inputDate;
  }

  public date(): Date{
    return new Date(this.inPutDate.getTime() + 1000000000 * 1000);
  }
}