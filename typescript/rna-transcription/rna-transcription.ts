export function toRna(dna:string):string {
  const dnaTranslator = new Map<string, string>([
    ["G", "C"],
    ["C", "G"],
    ["T", "A"],
    ["A", "U"],
])
  let result : string = ''

  for(let i = 0; i < dna.length ; i ++){
    let letter:string = dna.charAt(i)
    if(!dnaTranslator.has(letter))
      throw new Error('Invalid input DNA.')
    else
      result += dnaTranslator.get(letter)
  }

  return result
}
