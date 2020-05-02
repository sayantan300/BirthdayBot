package me.stqlth.birthdaybot.commands.staff;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import me.stqlth.birthdaybot.utils.DatabaseMethods;
import me.stqlth.birthdaybot.utils.EmbedSender;
import me.stqlth.birthdaybot.utils.Utilities;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.TextChannel;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class TestMessage extends Command {

	private DatabaseMethods db;

	public TestMessage(DatabaseMethods databaseMethods) {
		this.name = "testmessage";
		this.guildOnly = true;
		this.help = "Test your guild's birthday message.";
		this.hidden = true;
		this.arguments = "[# of birthdays]";
		this.category = new Category("Utilities");
		this.botPermissions = new Permission[]{Permission.MESSAGE_WRITE, Permission.MESSAGE_EMBED_LINKS};

		this.db = databaseMethods;
	}

	@Override
	protected void execute(CommandEvent event) {
		TextChannel channel = event.getTextChannel();
		String[] args = event.getMessage().getContentRaw().split(" ");

		String guildMessage = db.getGuildBirthdayMessage(event.getGuild());

		if (guildMessage.equals("0"))
			guildMessage = "Happy Birthday @Users!";

		int testAmount = 1;

		List<Member> testList = new ArrayList<>();
		testList.add(event.getMember());

		if (args.length == 3) {
			try {
				testAmount = Integer.parseInt(args[2]);
			} catch (NumberFormatException ignored) {}
			testAmount = Math.min(testAmount, 5);
			for (int i = 1; i < testAmount; i++)
				testList.add(event.getMember());
		}

		guildMessage = guildMessage.replaceAll("@Users", Utilities.getBirthdays(testList).toString());
		EmbedSender.sendEmbed(channel, null, guildMessage, Color.decode("#1CFE86"));
	}
}
