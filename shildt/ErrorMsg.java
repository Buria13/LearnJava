package shildt;

public class ErrorMsg {
    String msgs[] = {
            "Ошибка ввода",
            "Ошибка вывод",
            "Мало места на диске",
            "Выход индекса за границы диапазона",
    };

    String getErrorMsg(int i) {
        if(i >=0 & i < msgs.length) return msgs[i];
        else return "Несуществующий код ошибки";
    }
}
