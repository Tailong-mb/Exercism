export class DnDCharacter {
  
  hitpoints: number;
  strength: number;
  dexterity: number;
  constitution: number;
  intelligence: number;
  wisdom: number;
  charisma: number;
  
  constructor() {
    this.strength = DnDCharacter.generateAbilityScore();
    this.dexterity = DnDCharacter.generateAbilityScore();
    this.constitution = DnDCharacter.generateAbilityScore();
    this.intelligence = DnDCharacter.generateAbilityScore();
    this.wisdom = DnDCharacter.generateAbilityScore();
    this.charisma = DnDCharacter.generateAbilityScore();
    this.hitpoints= 10 + DnDCharacter.getModifierFor(this.constitution);
  }
  
  public static generateAbilityScore(): number {
    return 4;
  }
  
  public static getModifierFor(abilityValue: number): number {
    return Math.floor( ( abilityValue - 10 ) / 2 );
  }
}