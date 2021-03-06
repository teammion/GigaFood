/*
 * Copyright (c) 2016, Team Mion
 *
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
 * ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
 * OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */

package teammion.gigafood;

import teammion.gigafood.recipes.ShapedRecipes;
import teammion.gigafood.recipes.ShapelessRecipes;
import teammion.gigafood.recipes.SmeltingRecipes;

/**
 * Created on 11.08.16 at 14:24
 *
 * @author Stefan Wimmer <stefanwimmer128@gmail.com>
 */
public abstract class Recipes
{
    private static final Recipes SHAPED = new ShapedRecipes();
    private static final Recipes SHAPELESS = new ShapelessRecipes();
    private static final Recipes SMELTING = new SmeltingRecipes();
    
    public static void registerAll()
    {
        SHAPED.register();
        SHAPELESS.register();
        SMELTING.register();
    }
    
    public abstract void register();
}
