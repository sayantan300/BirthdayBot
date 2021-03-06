# Birthday Bot

**Discord Bot** - Track and celebrate birthdays in your discord server! Use `bday help` to get started!

## [Click here to add Birthday Bot to your Discord server!](https://discord.com/api/oauth2/authorize?client_id=656621136808902656&permissions=268659792&scope=bot)

[Join The Support Server](https://discord.gg/9gUQFtz) | [Donate with Paypal!](https://www.paypal.com/cgi-bin/webscr?cmd=_donations&business=PE97AGAPRX35Q&currency_code=USD&source=url)

**Example Birthday Announcement (Fully customizable):**

![Example Birthday Announcement](https://i.imgur.com/BZcEJ5j.png)

In your Discord server Birthday Bot will track your users' birthdays and using their time zone celebrate their birthday through its customizable birthday role and message. Even if you have a large discord, use Birthday Bots trusted-role system to only celebrate the users you want to avoid the spam of tracking everyone.

## Setting your birthday
Birthday Bot makes everything easy using an easily to follow process.

Start by using `bday set`.

![Start](https://i.imgur.com/Evo2jsp.png)

Birthday Bot uses time zones to detect when to celebrate each user's birthday. If you are unsure of your time zone you can find it [here](https://github.com/scottbucher/BirthdayBot/blob/master/README.md#finding-your-time-zone).

Now, you can then reply to this message with your desired time zone.

![Time Zone Input](https://i.imgur.com/fcmXvsQ.png)

Birthday Bot will now know your time zone and will use this to know what time to celebrate your birthday!

Now, Birthday Bot will prompt you to put your Birth Month & Date in the following format: MM/DD

![Birthday Prompt](https://i.imgur.com/hKvd9bm.png)

Simply reply to this message with your desired date.

![Birthday Input](https://i.imgur.com/D6OArx2.png)

Finally, the confirmation menu will appear.

![Confirmation](https://i.imgur.com/gBafugI.png)

Ensure this is the correct information, then confirm by clicking the checkmark.

Note: Each user only has a limited amount of Birthday Sets. These multiple sets are made to account for incorrect information input, time zone changes, etc.
Learn more [here](https://birthdaybot.scottbucher.dev/faq#how-many-times-can-i-set-my-birthday).

![End](https://i.imgur.com/2F8u3Cw.png)

For users that is it! Server owners will have to do a bit more but Birthday Bot makes it easy with an interactive setup. For more information on server setup follow our guide here.

## Finding your time zone

[Kevin Novak](https://github.com/KevinNovak) has created a handy [map time zone picker](https://kevinnovak.github.io/Time-Zone-Picker/)!

Simply click your location on the map and copy the name of the selected time zone. You can then use it in the `bday set` command.

![Setting your time zone](https://i.imgur.com/ibPmjNs.png)

## Commands

The following are commands for BirthdayBot. To run a command, prefix the command with `bday`, for example, `bday help` or `@BirthdayBot help`.

### Utilities

* `set` - Set your birthday.

* `purge` - Remove your birthday data.

* `next` - View the next birthday(s) in the server.

* `view [name]` - View your birthday or a user's birthday.

* `invite` - Invite Birthday Bot to a server.

* `support` - Join the support server.

* `map` - View the timezone map.

### Information

* `help` - Help with Birthday Bot

* `help setup` - Help for server setup.

* `help setup message` - Help for the birthday message settings.

* `help setup trusted` - Help for the trusted system.

* `settings` - View server's settings.

### Server Confirguration (Admins only)

#### Required Settings

* `setup` - Interactive guide for server setup.

* `create <channel/role>` - Create the default birthday role/channel.

* `update <channel/role> <#channel/@role>` - Update the birthday role/channel.

* `clear <channel/role>` - Clear the birthday channel/role

#### Birthday Message Settings

* `setup message` - Interactive guide for message settings setup.

* `message list [page]` - List all custom birthday messages.

* `message add <message>` - Add a custom birthday message.

* `message remove <position>` - Remove a certain birthday message.

* `message clear` - Clear all custom birthday messages.

* `message time <0-23>` - Set the birthday message time.

* `message mention <role/group>` - Set the birthday message mention setting.

* `message embed <T/F>` - Should the birthday message be embedded.

* `message test <position> [user count]` - Test a birthday message.

#### Trusted System Settings

* `setup trusted` - Interactive guide for trusted system settings setup.

* `create trustedRole` - Create the default trusted role.

* `updated trustedRole <channel/role>` - Update the trusted role.

* `clear trustedRole` - Clear the trusted role.

* `trusted preventMsg <T/F>` - If trusted role is required for a birthday message.

* `trusted preventRole <T/F>` - If trusted role is required to get the birthday role.

## Help

For additional help join the support server [here](https://discord.gg/9gUQFtz).
