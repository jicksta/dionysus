FROM ruby

RUN apt-get update && apt-get install -y zsh vim ack-grep manpages git imagemagick openssl openssh-client
# RUN apt-get install -y openssh-server

RUN addgroup docker
RUN useradd --create-home --shell /bin/zsh --groups docker demeter

RUN git clone --recurse-submodules --depth 1 git://github.com/jicksta/dotfiles /dotfiles

RUN ln -s /dotfiles/zshrc /home/demeter/.zshrc
RUN ln -s /dotfiles/zsh /home/demeter/.zsh
RUN ln -s /dotfiles/gemrc /home/demeter/.gemrc
RUN ln -s /dotfiles/vimrc /home/demeter/.vimrc
RUN ln -s /dotfiles/vim /home/demeter/.vim
RUN ln -s /dotfiles/gitconfig /home/demeter/.gitconfig
COPY zsh_local /home/demeter/.zsh_local

USER demeter
WORKDIR /home/demeter

#COPY install-nvm.sh install-nvm.sh
#RUN chmod +x install-nvm.sh
#RUN ./install-nvm.sh
# RUN nvm install node && nvm use node


#ADD node-v5.4.1-linux-x64.tar.xz /usr/local/node

#RUN npm install -g bower webpack-dev-server webpack phantomjs
#RUN npm install -g ember-cli@2.2.0-beta.6
