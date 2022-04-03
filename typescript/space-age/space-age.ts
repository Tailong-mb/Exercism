const EARTH_ORBITAL_TIME = 31557600
const ratio = {
    earth: 1.0,
    mercury: 0.2408467,
    venus: 0.61519726,
    mars: 1.8808158,
    jupiter: 11.862615,
    saturn: 29.447498,
    uranus: 84.016846,
    neptune: 164.79132
}

type Planet = keyof typeof ratio

export function age(planet: Planet, time: number): number {
    return parseFloat((time / (ratio[planet] * EARTH_ORBITAL_TIME)).toFixed(2))
}