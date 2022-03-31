const ColorAry =
  [`black`,
    `brown`,
    `red`,
    `orange`,
    `yellow`,
    `green`,
    `blue`,
    `violet`,
    `grey`,
    `white`,] as const

type color = typeof ColorAry[number]

export function decodedResistorValue([colorOne,colorTwo,colorThree] : color[]): string {

  let numberPartResult = ((ColorAry.indexOf(colorOne) * 10) + ColorAry.indexOf(colorTwo)) * (10 ** ColorAry.indexOf(colorThree))
  let stringPartResult : string

  if(numberPartResult >+ 1000){
    stringPartResult = 'kiloohms'
    numberPartResult /= 1000
  } else {
    stringPartResult = 'ohms'
  }

  return `${numberPartResult} ${stringPartResult}`
}
