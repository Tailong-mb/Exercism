export function transform(dictData:{[key: string]: string[]}) {
  let beforeKeys = Object.keys(dictData);
  let result = {} as {[key: string]: number};
  
  beforeKeys.forEach((key: string) => {   
    dictData[key].forEach((letter: string) => {
      result[letter.toLowerCase()]= Number(key);
    });
  })
  return result
}