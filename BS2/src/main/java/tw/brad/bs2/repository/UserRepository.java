package tw.brad.bs2.repository;

import org.springframework.data.repository.CrudRepository;

import tw.brad.bs2.model.UserV2;

/*
 * 基本款: CrudRepository
 * 分頁款: PagingAndSortRepository
 * 超強款: JpaRepository
 * ---------------------------------
 * save() => 增修
 * saveAll(List, Set, Map, [])
 * 
 * deleteById() => 刪除
 * delete(物件)
 * 
 * findById() => 查詢
 * existsById() => true/false
 * 
 * count() ==> 筆數
 * 
 */
public interface UserRepository extends CrudRepository<UserV2, Long>{

}
