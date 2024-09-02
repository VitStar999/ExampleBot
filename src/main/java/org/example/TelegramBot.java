package org.example;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class TelegramBot extends TelegramLongPollingBot {
    @Override
    public String getBotToken() {
        return "7273624768:AAGTSovGZbzBUn4LNs-SvNqO5MOSaEg9AxM";
    }
    @Override
    public String getBotUsername() {
        return "Trainingmybot1Bot";
    }
    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String messageText = update.getMessage().getText().trim();
            String responseText;

            switch (messageText) {
                case "1":
                    responseText = "Бег\nНоги\nПресс\nСтойка на руках";
                    break;
                case "2":
                    responseText = "Бег\nГрудь и трицепс\nБицепс";
                    break;
                case "3":
                    responseText = "Бег\nТрапеция\nСпина\nСтойка на руках";
                    break;
                case "4":
                    responseText = "Бег\nНоги\nПресс\nСтойка на руках";
                    break;
                case "5":
                    responseText = "Бег\nГрудь и трицепс\nБицепс";
                    break;
                case "6":
                    responseText = "Бег\nТрапеция\nСпина\nСтойка на руках";
                    break;
                default:
                    responseText = "Выходной";
            }

            SendMessage message = new SendMessage();
            message.setChatId(update.getMessage().getChatId().toString());
            message.setText(responseText);

            try {
                execute(message);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }


}
