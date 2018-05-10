package com.gamedriver.java.utilities;

//we will keep our Splash screens here! it will be easy to call them!

public class Splash {

    //calling Splash.printTitle() will splash the title of our game!
    public static void printTitle(){
        System.out.print("\n"
                + "                                                 :::::::::: ::::::::   ::::::::      :::     :::::::::  ::::::::::\n"
                + "                                                :+:       :+:    :+: :+:    :+:   :+: :+:   :+:    :+: :+:\n"
                + "                                               +:+       +:+        +:+         +:+   +:+  +:+    +:+ +:+\n"
                + "                                              +#++:++#  +#++:++#++ +#+        +#++:++#++: +#++:++#+  +#++:++#\n"
                + "                                             +#+              +#+ +#+        +#+     +#+ +#+        +#+\n"
                + "                                            #+#       #+#    #+# #+#    #+# #+#     #+# #+#        #+#\n"
                + "                                           ########## ########   ########  ###     ### ###        ##########\n"
                + "\n\n\n\n");
    }

    public static void printGameOver(){
        System.out.print("\n \n \n \n \n" //adds a few lines to seperate the game over screen
                + "                                                 ::::::::      :::       :::   :::   :::::::::: \n"
                + "                                               :+:    :+:   :+: :+:    :+:+: :+:+:  :+:         \n"
                + "                                              +:+         +:+   +:+  +:+ +:+:+ +:+ +:+          \n"
                + "                                             :#:        +#++:++#++: +#+  +:+  +#+ +#++:++#      \n"
                + "                                            +#+   +#+# +#+     +#+ +#+       +#+ +#+            \n"
                + "                                           #+#    #+# #+#     #+# #+#       #+# #+#             \n"
                + "                                           ########  ###     ### ###       ### ##########       \n"
                + "                                                 ::::::::  :::     ::: :::::::::: ::::::::: \n"
                + "                                               :+:    :+: :+:     :+: :+:        :+:    :+: \n"
                + "                                              +:+    +:+ +:+     +:+ +:+        +:+    +:+  \n"
                + "                                             +#+    +:+ +#+     +:+ +#++:++#   +#++:++#:    \n"
                + "                                            +#+    +#+  +#+   +#+  +#+        +#+    +#+    \n"
                + "                                           #+#    #+#   #+#+#+#   #+#        #+#    #+#     \n"
                + "                                           ########      ###     ########## ###    ###      \n"
                + "\n \n \n                                           Thanks for playing!"
                + "\n \n");
    }

}
