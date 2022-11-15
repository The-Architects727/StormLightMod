scoreboard players add @e[type=minecraft:armor_stand,nbt={NoGravity:1b,Silent:1b,Invulnerable:1b,Invisible:1b,CustomName:'{"text":"Highstormtimer"}'}] highstorm 1
scoreboard players add @e[type=minecraft:armor_stand,nbt={NoGravity:1b,Silent:1b,Invulnerable:1b,Invisible:1b,CustomName:'{"text":"Highstormtimer"}'}] highstormduration 1
execute if score @e[type=minecraft:armor_stand,limit=1,nbt={NoGravity:1b,Silent:1b,Invulnerable:1b,Invisible:1b,CustomName:'{"text":"Highstormtimer"}'}] highstorm matches 262800 run weather rain
execute if score @e[type=minecraft:armor_stand,limit=1,nbt={NoGravity:1b,Silent:1b,Invulnerable:1b,Invisible:1b,CustomName:'{"text":"Highstormtimer"}'}] highstorm matches 264000 run weather thunder
execute if score @e[type=minecraft:armor_stand,limit=1,nbt={NoGravity:1b,Silent:1b,Invulnerable:1b,Invisible:1b,CustomName:'{"text":"Highstormtimer"}'}] highstorm matches 264000 run scoreboard players set @e[type=minecraft:armor_stand,limit=1,nbt={NoGravity:1b,Silent:1b,Invulnerable:1b,Invisible:1b,CustomName:'{"text":"Highstormtimer"}'}] highstormduration 0
execute if score @e[type=minecraft:armor_stand,limit=1,nbt={NoGravity:1b,Silent:1b,Invulnerable:1b,Invisible:1b,CustomName:'{"text":"Highstormtimer"}'}] highstormduration matches 6000 run weather rain
execute if score @e[type=minecraft:armor_stand,limit=1,nbt={NoGravity:1b,Silent:1b,Invulnerable:1b,Invisible:1b,CustomName:'{"text":"Highstormtimer"}'}] highstormdurration matches 12000 run scoreboard players set @e[type=minecraft:armor_stand,limit=1,nbt={NoGravity:1b,Silent:1b,Invulnerable:1b,Invisible:1b,CustomName:'{"text":"Highstormtimer"}'}] highstorm 0


execute as @e[tag=!joined] run run power grant @s highstorm:push
tag @e[tag=!joined] add joined
# convert spheres in highstorm
execute as @e[type=minecraft:item] if entity @s[type=item,nbt={Item:{id:"stormlightmod:sapphire_sphere",Count:1b}}] at @s if predicate stormlightmod:thunder run summon minecraft:item ~ ~ ~ {Item:{id:"stormlightmod:infused_sapphire_sphere",Count:1b}}
execute as @e[type=minecraft:item] if entity @s[type=item,nbt={Item:{id:"stormlightmod:sapphire_sphere",Count:1b}}] at @s if predicate stormlightmod:thunder run kill @s

execute as @e[type=minecraft:item] if entity @s[type=item,nbt={Item:{id:"stormlightmod:smokestone_sphere",Count:1b}}] at @s if predicate stormlightmod:thunder run summon minecraft:item ~ ~ ~ {Item:{id:"stormlightmod:infused_smokeston_sphere",Count:1b}}
execute as @e[type=minecraft:item] if entity @s[type=item,nbt={Item:{id:"stormlightmod:smokeston_sphere",Count:1b}}] at @s if predicate stormlightmod:thunder run kill @s

execute as @e[type=minecraft:item] if entity @s[type=item,nbt={Item:{id:"stormlightmod:ruby_sphere",Count:1b}}] at @s if predicate stormlightmod:thunder run summon minecraft:item ~ ~ ~ {Item:{id:"stormlightmod:infused_ruby_sphere",Count:1b}}
execute as @e[type=minecraft:item] if entity @s[type=item,nbt={Item:{id:"stormlightmod:ruby_sphere",Count:1b}}] at @s if predicate stormlightmod:thunder run kill @s

execute as @e[type=minecraft:item] if entity @s[type=item,nbt={Item:{id:"stormlightmod:diamond_sphere",Count:1b}}] at @s if predicate stormlightmod:thunder run summon minecraft:item ~ ~ ~ {Item:{id:"stormlightmod:infused_diamond_sphere",Count:1b}}
execute as @e[type=minecraft:item] if entity @s[type=item,nbt={Item:{id:"stormlightmod:diamond_sphere",Count:1b}}] at @s if predicate stormlightmod:thunder run kill @s

execute as @e[type=minecraft:item] if entity @s[type=item,nbt={Item:{id:"stormlightmod:emerald_sphere",Count:1b}}] at @s if predicate stormlightmod:thunder run summon minecraft:item ~ ~ ~ {Item:{id:"stormlightmod:infused_emerald_sphere",Count:1b}}
execute as @e[type=minecraft:item] if entity @s[type=item,nbt={Item:{id:"stormlightmod:emerald_sphere",Count:1b}}] at @s if predicate stormlightmod:thunder run kill @s

execute as @e[type=minecraft:item] if entity @s[type=item,nbt={Item:{id:"stormlightmod:garnet_sphere",Count:1b}}] at @s if predicate stormlightmod:thunder run summon minecraft:item ~ ~ ~ {Item:{id:"stormlightmod:infused_garnet_sphere",Count:1b}}
execute as @e[type=minecraft:item] if entity @s[type=item,nbt={Item:{id:"stormlightmod:garnet_sphere",Count:1b}}] at @s if predicate stormlightmod:thunder run kill @s

execute as @e[type=minecraft:item] if entity @s[type=item,nbt={Item:{id:"stormlightmod:zircon_sphere",Count:1b}}] at @s if predicate stormlightmod:thunder run summon minecraft:item ~ ~ ~ {Item:{id:"stormlightmod:infused_zircon_sphere",Count:1b}}
execute as @e[type=minecraft:item] if entity @s[type=item,nbt={Item:{id:"stormlightmod:zircon_sphere",Count:1b}}] at @s if predicate stormlightmod:thunder run kill @s

execute as @e[type=minecraft:item] if entity @s[type=item,nbt={Item:{id:"stormlightmod:amathyst_sphere",Count:1b}}] at @s if predicate stormlightmod:thunder run summon minecraft:item ~ ~ ~ {Item:{id:"stormlightmod:infused_amathyst_sphere",Count:1b}}
execute as @e[type=minecraft:item] if entity @s[type=item,nbt={Item:{id:"stormlightmod:amathyst_sphere",Count:1b}}] at @s if predicate stormlightmod:thunder run kill @s

execute as @e[type=minecraft:item] if entity @s[type=item,nbt={Item:{id:"stormlightmod:topaz_sphere",Count:1b}}] at @s if predicate stormlightmod:thunder run summon minecraft:item ~ ~ ~ {Item:{id:"stormlightmod:infused_topaz_sphere",Count:1b}}
execute as @e[type=minecraft:item] if entity @s[type=item,nbt={Item:{id:"stormlightmod:topaz_sphere",Count:1b}}] at @s if predicate stormlightmod:thunder run kill @s

execute as @e[type=minecraft:item] if entity @s[type=item,nbt={Item:{id:"stormlightmod:heliodor_sphere",Count:1b}}] at @s if predicate stormlightmod:thunder run summon minecraft:item ~ ~ ~ {Item:{id:"stormlightmod:infused_heliodor_sphere",Count:1b}}
execute as @e[type=minecraft:item] if entity @s[type=item,nbt={Item:{id:"stormlightmod:heliodor_sphere",Count:1b}}] at @s if predicate stormlightmod:thunder run kill @s

