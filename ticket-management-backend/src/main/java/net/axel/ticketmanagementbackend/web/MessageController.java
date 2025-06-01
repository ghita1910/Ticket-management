package net.axel.ticketmanagementbackend.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(MessageController.CONTROLLER_PATH)

@RequiredArgsConstructor
public class MessageController {

    public final static String CONTROLLER_PATH = "api/v1/messages";
}
