#!/bin/zsh
# This file provides a folder-specific zsh ENV for dionysus.
#
# To use:
#
#   antigen bundle Tarrasch/zsh-autoenv
#
# Every new or modified .autoenv.zsh must be explicitly granted
# permissions to execute. zsh-autoenv prompts you the first time
# you enter the directory to consent the unrecognized file.

eval $(docker-machine env dionysus)
echo "$bg[cyan]$fg[white]sourcing Dionysus .autoenv.zsh$reset_color"
