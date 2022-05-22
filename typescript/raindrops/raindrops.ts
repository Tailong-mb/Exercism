export function convert(num: number): string {
    var ans: string = '';
    if (!(num % 3)) ans += 'Pling';
    if (!(num % 5)) ans += 'Plang'; 
    if (!(num % 7)) ans += 'Plong'; 
    if (!ans) ans += num;
    return ans;
}