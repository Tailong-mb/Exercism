const proteinDictionary = {
  AUG: 'Methionine',
  UUU: 'Phenylalanine',
  UUC: 'Phenylalanine',
  UUA: 'Leucine',
  UUG: 'Leucine',
  UCU: 'Serine',
  UCC: 'Serine',
  UCA: 'Serine',
  UCG: 'Serine',
  UAU: 'Tyrosine',
  UAC: 'Tyrosine',
  UGU: 'Cysteine',
  UGC: 'Cysteine',
  UGG: 'Tryptophan',
  UAA: 'STOP',
  UAG: 'STOP',
  UGA: 'STOP'
}

type RNA = keyof typeof proteinDictionary
export function translate(sequence: string): string[] {
  const rnaSequence = sequence.match(/.{1,3}/gu) ?? []
  const proteinSequence = rnaSequence.map((rna) => proteinDictionary[rna as RNA])
  const stop = proteinSequence.indexOf('STOP')
  return stop === -1 ? proteinSequence : proteinSequence.slice(0, stop)
}
