package net.axel.ticketmanagementbackend.web;

import lombok.RequiredArgsConstructor;
import net.axel.ticketmanagementbackend.service.TicketService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(TicketController.CONTROLLER_PATH)

@RequiredArgsConstructor
public class TicketController {

    public final static String CONTROLLER_PATH = "api/v1/tickets";

    private final TicketService ticketService;
}
