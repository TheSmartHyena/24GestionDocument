public class FDocument {
    public static IDoc createDocument(ETypeDoc type) {
        return switch (type) {
            case ETypeDoc.LETTER -> new Letter(Utils.getUuid());

            default -> null;
        };
    }
}
