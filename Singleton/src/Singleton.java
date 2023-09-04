public class Singleton {
    private static Singleton INSTANCE;

    /**
     * Конструктор класса "Одиночки", закрыт модификатором доступа private
     * для исключения возможности его использования
     */
    private Singleton(){}

    /**
     * Метод получения экземпляра класса "Одиночки", если экземпляр не был создан,
     * то создается, иначе возвращает ранее созданный экземпляр класса.
     * Метод синхронизирован для потокобезопасности
     * @return объект "Одиночка"
     */
    public static synchronized Singleton getInstance(){
        if (INSTANCE == null){
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
