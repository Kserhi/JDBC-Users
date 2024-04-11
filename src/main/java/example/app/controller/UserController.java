package example.app.controller;

import example.app.service.UserService;
import example.app.utils.AppStarter;
import example.app.view.*;

public class UserController {

    UserService service = new UserService();

    public void create() {
        ContactCreateView view = new ContactCreateView();
        view.getOutput(service.create(view.getData()));
        AppStarter.startApp();
    }

    public void read() {
        ContactReadView view = new ContactReadView();
        view.getOutput(service.read());
        AppStarter.startApp();
    }

    public void update() {
        ContactUpdateView view = new ContactUpdateView();
        view.getOutput(service.update(view.getData()));
        AppStarter.startApp();
    }

    public void delete() {
        ContactDeleteView view = new ContactDeleteView();
        view.getOutput(service.delete(view.getData()));
        AppStarter.startApp();
    }

    public void readById() {
        ContactReadByIdView view = new ContactReadByIdView();
        view.getOutput(service.readById(view.getData()));
        AppStarter.startApp();
    }
}
