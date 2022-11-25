package com.shop.MemberService;

import com.shop.repository.ItemImgRepository;
import com.shop.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class ItemService {  

    private final ItemRepository itemRepository;
    private final ItemImgService itemImgRepository;
    private final ItemImgRepository itemImgRepository;

}
