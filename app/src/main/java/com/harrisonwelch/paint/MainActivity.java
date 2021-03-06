/*
Feature: Stickers
Description: Place stickers of stars and leaves and other zany things on your pictures!
Variables used: AlertDialog stickerAlert;
                int STICKER_STAR = 1;
                int STICKER_LEAF = 2;
                int STICKER_LEE = 3;
                Bitmap currentBitmap;
                Bitmap stickerStar;
                Bitmap stickerLee;
                Bitmap stickerLeaf;

Classes used:   class Sticker
Methods used:   setupStickerDialog(), DrawActivity
                setupStickerBitmaps(), PictDraw
                setSticker, PictDraw


Feature: Frame around your picture
Description: Put a frame around your picture to give it that elegant touch!
Variables used:  Bitmap frame_outside;
                 private boolean doDrawFrame = false;
Classes used:   None
Methods used:   toggleDoDrawFrame(), PictDraw
                drawFrame(), PictDraw


Feature:            Email the Image
Description:        Email the image to anyone you want!
Variables used:     Intent emailIntent
                    File publicFile
Classes used:       Intent
                    File
                    Bitmap
Methods used:       emailImage()
                    startActivity()

Feature:            Undo Action
Description:        Undo the previous line, rectangle, brush-stroke, or bitmap taken by the user
Variables used:     shapePositions
                    startPos
                    stopPos
                    shapes
Classes used:       Stack
                    Path
Methods used:       undo()
                    clear()
                    stack - pop()
 */

package com.harrisonwelch.paint;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_draw).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DrawActivity.class);
                startActivity(intent);
            }
        });


    }



}
