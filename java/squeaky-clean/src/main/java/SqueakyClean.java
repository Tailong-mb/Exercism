class SqueakyClean {
    static String clean(String identifier) {
        final StringBuilder cleanIdentifier = new StringBuilder();
        for (int i = 0; i < identifier.length(); i++) {
            final char charIdentifier = identifier.charAt(i);
            if (Character.isSpaceChar(charIdentifier)) {
                cleanIdentifier.append("_");
            } else if (Character.isISOControl(charIdentifier)) {
                cleanIdentifier.append("CTRL");
            } else if (charIdentifier== '-' && i < identifier.length() + 1) {
                i++;
                cleanIdentifier.append(Character.toUpperCase(identifier.charAt(i)));
            } else if (charIdentifier >= 'α' && charIdentifier <= 'ω') {
            } else if (Character.isAlphabetic(charIdentifier)) {
                cleanIdentifier.append(charIdentifier);
            }
        }
        return cleanIdentifier.toString();
    }
}
