package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameListDto;
import com.devsuperior.dslist.dto.GameMinDto;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.projections.GameMinProjection;
import com.devsuperior.dslist.repositories.GameListRepository;
import com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameListDto> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x->new GameListDto(x)).toList();

    }
    @Transactional
    public void move(Long listId, int  sourceIndex, int destinationIndex){
        List<GameMinProjection>list=gameRepository.searchByList(listId);
        GameMinProjection obj=list.get(sourceIndex);
        list.add(destinationIndex,obj);
        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex < destinationIndex ? destinationIndex: sourceIndex;
        for(int i=min; i<=max; i++){
            gameListRepository.updateBelongingPosition(listId,list.get(i).getId(),i);
        }

    }

}
