/*
 * Copyright (c) 2019 Owain van Brakel <https:github.com/Owain94>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

rootProject.name = "OpenOSRS Plugins"

include(":achievementdiary")
include(":agility")
include(":ammo")
include(":animsmoothing")
include(":antidrag")
include(":attackstyles")
include(":bank")
include(":banktags")
include(":banlist")
include(":barrows")
include(":blastfurnance")
include(":blastmine")
include(":boosts")
include(":bosstimetracker")
include(":bronzeman")
include(":camera")
include(":cannon")
include(":chatcommands")
include(":chatfilter")
include(":chathistory")
include(":chatnotifications")
include(":chattranslation")
include(":barbarianassault")
include(":clanchat")
include(":cluescroll")
include(":combatlevel")
include(":cooking")
include(":corp")
include(":customclientresizing")
include(":customcursor")
include(":dailytaskindicators")
include(":defaultworld")
include(":devtools")
include(":discord")
include(":emojis")
include(":entityhider")
include(":examine")
include(":experiencedrop")
include(":fairyring")
include(":feed")
include(":fishing")
include(":fps")
include(":friendlist")
include(":friendnotes")
include(":friendtagging")
include(":gpu")
include(":grandexchange")
include(":grounditems")
include(":groundmarkers")
include(":herbiboar")
include(":highscore")
include(":highalchemy")
include(":hunter")
include(":idlenotifier")
include(":implings")
include(":instancemap")
include(":interfacestyles")
include(":inventorygrid")
include(":inventorytags")
include(":inventoryviewer")
include(":itemcharges")
include(":itemidentification")
include(":itemprices")
include(":itemskeptondeath")
include(":itemstats")
include(":keyremapping")
include(":kingdomofmiscellania")
include(":kourendlibrary")
include(":learntoclick")
include(":loginscreen")
include(":loottracker")
include(":lowmemory")
include(":menuentryswapper")
include(":metronome")
include(":minimap")
include(":mining")
include(":motherlode")
include(":mousehighlight")
include(":mta")
include(":music")
include(":nightmarezone")
include(":notes")
include(":npchighlight")
include(":npcstatus")
include(":npcunaggroarea")
include(":objectindicators")
include(":opponentinfo")
include(":party")
include(":performancestats")
include(":pestcontrol")
include(":playerindicators")
include(":playerinfo")
include(":poh")
include(":poison")
include(":prayer")
include(":prayeralert")
include(":privateserver")
include(":profiles")
include(":puzzlesolver")
include(":pyramidplunder")
include(":questlist")
include(":raids")
include(":raidsthieving")
include(":randomevents")
include(":reminders")
include(":reportbutton")
include(":roguesden")
include(":runecraft")
include(":runepouch")
include(":screenmarkers")
include(":screenshot")
include(":shayzieninfirmary")
include(":skillcalculator")
include(":skybox")
include(":slayer")
include(":slayermusiq")
include(":smelting")
include(":spawntimer")
include(":specialcounter")
include(":statusbars")
include(":statusorbs")
include(":stretchedmode")
include(":suppliestracker")
include(":teamcapes")
include(":tearsofguthix")
include(":thieving")
include(":tickcounter")
include(":tileindicators")
include(":timers")
include(":timestamp")
include(":timetracking")
include(":tithefarm")
include(":tmorph")
include(":twitch")
include(":virtuallevels")
include(":wiki")
include(":wintertodt")
include(":woodcutting")
include(":worldhopper")
include(":worldmap")
include(":xpglobes")
include(":xptracker")
include(":xpupdater")
include(":zalcano")

for (project in rootProject.children) {
    project.apply {
        projectDir = file(name)
        buildFileName = "$name.gradle.kts"

        require(projectDir.isDirectory) { "Project '${project.path} must have a $projectDir directory" }
        require(buildFile.isFile) { "Project '${project.path} must have a $buildFile build script" }
    }
}