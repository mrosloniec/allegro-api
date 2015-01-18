package AllegroWebApi;

public class AllegroWebApiPortTypeProxy implements AllegroWebApi.AllegroWebApiPortType {
  private String _endpoint = null;
  private AllegroWebApi.AllegroWebApiPortType allegroWebApiPortType = null;
  
  public AllegroWebApiPortTypeProxy() {
    _initAllegroWebApiPortTypeProxy();
  }
  
  public AllegroWebApiPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initAllegroWebApiPortTypeProxy();
  }
  
  private void _initAllegroWebApiPortTypeProxy() {
    try {
      allegroWebApiPortType = (new AllegroWebApi.AllegroWebApiServiceLocator()).getAllegroWebApiPort();
      if (allegroWebApiPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)allegroWebApiPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)allegroWebApiPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (allegroWebApiPortType != null)
      ((javax.xml.rpc.Stub)allegroWebApiPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public AllegroWebApi.AllegroWebApiPortType getAllegroWebApiPortType() {
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType;
  }
  
  public void doAddDescToItems(java.lang.String sessionHandle, long[] itemsIdArray, java.lang.String itDescription, AllegroWebApi.holders.ArrayOfItemsIDHolder arrayItemsAddId, AllegroWebApi.holders.ArrayOfItemsIDHolder arrayItemsDescToLong, AllegroWebApi.holders.ArrayOfItemsIDHolder arrayItemsNotFound) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doAddDescToItems(sessionHandle, itemsIdArray, itDescription, arrayItemsAddId, arrayItemsDescToLong, arrayItemsNotFound);
  }
  
  public AllegroWebApi.PostBuyFormPackageInfoStruct doAddPackageInfoToPostBuyForm(java.lang.String sessionId, long transactionId, AllegroWebApi.PackageInfoStruct[] packageInfo) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doAddPackageInfoToPostBuyForm(sessionId, transactionId, packageInfo);
  }
  
  public AllegroWebApi.UserBlackListAddResultStruct[] doAddToBlackList(java.lang.String sessionHandle, AllegroWebApi.UserBlackListStruct[] usersBlackListArray) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doAddToBlackList(sessionHandle, usersBlackListArray);
  }
  
  public AllegroWebApi.WatchListInfoStruct doAddToWatchList(java.lang.String sessionId, long[] itemIds) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doAddToWatchList(sessionId, itemIds);
  }
  
  public java.lang.String doBidItem(java.lang.String sessionHandle, long bidItId, float bidUserPrice, long bidQuantity, long bidBuyNow, AllegroWebApi.PharmacyRecipientDataStruct pharmacyRecipientData) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doBidItem(sessionHandle, bidItId, bidUserPrice, bidQuantity, bidBuyNow, pharmacyRecipientData);
  }
  
  public void doCancelBidItem(java.lang.String sessionHandle, long cancelItemId, int[] cancelBidsArray, java.lang.String cancelBidsReason, long cancelAddToBlackList, javax.xml.rpc.holders.IntHolder cancelBidValue, AllegroWebApi.holders.ArrayOfCancelBidsIDHolder cancelledBids, AllegroWebApi.holders.ArrayOfCancelBidsIDHolder notCancelledBids) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doCancelBidItem(sessionHandle, cancelItemId, cancelBidsArray, cancelBidsReason, cancelAddToBlackList, cancelBidValue, cancelledBids, notCancelledBids);
  }
  
  public int doCancelTransaction(java.lang.String sessionId, long transactionId) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doCancelTransaction(sessionId, transactionId);
  }
  
  public AllegroWebApi.ChangedItemStruct doChangeItemFields(java.lang.String sessionId, long itemId, AllegroWebApi.FieldsValue[] fieldsToModify, int[] fieldsToRemove, int previewOnly) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doChangeItemFields(sessionId, itemId, fieldsToModify, fieldsToRemove, previewOnly);
  }
  
  public java.lang.String doChangePriceItem(java.lang.String sessionHandle, javax.xml.rpc.holders.LongHolder itemId, float newStartingPrice, float newReservePrice, float newBuyNowPrice) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doChangePriceItem(sessionHandle, itemId, newStartingPrice, newReservePrice, newBuyNowPrice);
  }
  
  public void doChangeQuantityItem(java.lang.String sessionHandle, javax.xml.rpc.holders.LongHolder itemId, int newItemQuantity, javax.xml.rpc.holders.StringHolder itemInfo, javax.xml.rpc.holders.IntHolder itemQuantityLeft, javax.xml.rpc.holders.IntHolder itemQuantitySold) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doChangeQuantityItem(sessionHandle, itemId, newItemQuantity, itemInfo, itemQuantityLeft, itemQuantitySold);
  }
  
  public AllegroWebApi.ItemDescriptionStruct doCheckItemDescription(java.lang.String sessionId, java.lang.String descriptionContent) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doCheckItemDescription(sessionId, descriptionContent);
  }
  
  public void doCheckNewAuctionExt(java.lang.String sessionHandle, AllegroWebApi.FieldsValue[] fields, javax.xml.rpc.holders.StringHolder itemPrice, javax.xml.rpc.holders.StringHolder itemPriceDesc, javax.xml.rpc.holders.IntHolder itemIsAllegroStandard) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doCheckNewAuctionExt(sessionHandle, fields, itemPrice, itemPriceDesc, itemIsAllegroStandard);
  }
  
  public AllegroWebApi.CreatedItemTemplateStruct doCreateItemTemplate(java.lang.String sessionId, java.lang.String itemTemplateName, AllegroWebApi.FieldsValue[] itemTemplateFields) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doCreateItemTemplate(sessionId, itemTemplateName, itemTemplateFields);
  }
  
  public int doFeedback(java.lang.String sessionHandle, long feItemId, int feUseCommentTemplate, int feToUserId, java.lang.String feComment, java.lang.String feCommentType, int feOp, AllegroWebApi.SellRatingEstimationStruct[] feRating) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doFeedback(sessionHandle, feItemId, feUseCommentTemplate, feToUserId, feComment, feCommentType, feOp, feRating);
  }
  
  public AllegroWebApi.FeedbackResultStruct[] doFeedbackMany(java.lang.String sessionHandle, AllegroWebApi.FeedbackManyStruct[] feedbacksList) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doFeedbackMany(sessionHandle, feedbacksList);
  }
  
  public int doFinishItem(java.lang.String sessionHandle, long finishItemId, int finishCancelAllBids, java.lang.String finishCancelReason) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doFinishItem(sessionHandle, finishItemId, finishCancelAllBids, finishCancelReason);
  }
  
  public void doFinishItems(java.lang.String sessionHandle, AllegroWebApi.FinishItemsStruct[] finishItemsList, AllegroWebApi.holders.ArrayOfFinishSuccessStructHolder finishItemsSucceed, AllegroWebApi.holders.ArrayOfFinishFailureStructHolder finishItemsFailed) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doFinishItems(sessionHandle, finishItemsList, finishItemsSucceed, finishItemsFailed);
  }
  
  public float doGetAdminUserLicenceDate(java.lang.String adminSessionHandle, java.lang.String userLicLogin) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetAdminUserLicenceDate(adminSessionHandle, userLicLogin);
  }
  
  public AllegroWebApi.BidListStruct2[] doGetBidItem2(java.lang.String sessionHandle, long itemId) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetBidItem2(sessionHandle, itemId);
  }
  
  public AllegroWebApi.BlackListStruct[] doGetBlackListUsers(java.lang.String sessionHandle) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetBlackListUsers(sessionHandle);
  }
  
  public AllegroWebApi.CategoryData[] doGetCategoryPath(java.lang.String sessionId, int categoryId) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetCategoryPath(sessionId, categoryId);
  }
  
  public void doGetCatsData(int countryId, long localVersion, java.lang.String webapiKey, AllegroWebApi.holders.ArrayOfCatsHolder catsList, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doGetCatsData(countryId, localVersion, webapiKey, catsList, verKey, verStr);
  }
  
  public void doGetCatsDataCount(int countryId, long localVersion, java.lang.String webapiKey, javax.xml.rpc.holders.IntHolder catsCount, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doGetCatsDataCount(countryId, localVersion, webapiKey, catsCount, verKey, verStr);
  }
  
  public void doGetCatsDataLimit(int countryId, long localVersion, java.lang.String webapiKey, int offset, int packageElement, AllegroWebApi.holders.ArrayOfCatsHolder catsList, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doGetCatsDataLimit(countryId, localVersion, webapiKey, offset, packageElement, catsList, verKey, verStr);
  }
  
  public AllegroWebApi.CountryInfoType[] doGetCountries(int countryCode, java.lang.String webapiKey) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetCountries(countryCode, webapiKey);
  }
  
  public AllegroWebApi.DealsStruct[] doGetDeals(java.lang.String sessionHandle, long itemId, int buyerId) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetDeals(sessionHandle, itemId, buyerId);
  }
  
  public AllegroWebApi.FavouritesCategoriesStruct[] doGetFavouriteCategories(java.lang.String sessionHandle) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetFavouriteCategories(sessionHandle);
  }
  
  public AllegroWebApi.FavouritesSellersStruct[] doGetFavouriteSellers(java.lang.String sessionHandle) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetFavouriteSellers(sessionHandle);
  }
  
  public void doGetFeedback(java.lang.String sessionHandle, int feedbackFrom, int feedbackTo, int feedbackOffset, java.lang.String feedbackKindList, AllegroWebApi.holders.ArrayOfFeedbackListHolder feedbackList, javax.xml.rpc.holders.IntHolder feedbackCount) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doGetFeedback(sessionHandle, feedbackFrom, feedbackTo, feedbackOffset, feedbackKindList, feedbackList, feedbackCount);
  }
  
  public AllegroWebApi.FilledPostBuyFormsStruct doGetFilledPostBuyForms(java.lang.String sessionId, int paymentType, int userRole, long fillingTimeFrom, long fillingTimeTo) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetFilledPostBuyForms(sessionId, paymentType, userRole, fillingTimeFrom, fillingTimeTo);
  }
  
  public AllegroWebApi.FieldsValue[] doGetItemFields(java.lang.String sessionId, long itemId) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetItemFields(sessionId, itemId);
  }
  
  public AllegroWebApi.ItemTemplatesStruct doGetItemTemplates(java.lang.String sessionId, int[] itemTemplateIds) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetItemTemplates(sessionId, itemTemplateIds);
  }
  
  public AllegroWebApi.ItemImagesStruct[] doGetItemsImages(java.lang.String sessionHandle, AllegroWebApi.ItemGetImage[] itemsArray, int imageType) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetItemsImages(sessionHandle, itemsArray, imageType);
  }
  
  public void doGetItemsInfo(java.lang.String sessionHandle, long[] itemsIdArray, int getDesc, int getImageUrl, int getAttribs, int getPostageOptions, int getCompanyInfo, int getProductInfo, AllegroWebApi.holders.ArrayOfStructItemInfoListHolder arrayItemListInfo, AllegroWebApi.holders.ArrayOfItemsIDHolder arrayItemsNotFound, AllegroWebApi.holders.ArrayOfItemsIDHolder arrayItemsAdminKilled) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doGetItemsInfo(sessionHandle, itemsIdArray, getDesc, getImageUrl, getAttribs, getPostageOptions, getCompanyInfo, getProductInfo, arrayItemListInfo, arrayItemsNotFound, arrayItemsAdminKilled);
  }
  
  public AllegroWebApi.MessageToBuyerStruct doGetMessageToBuyer(java.lang.String sessionId, long itemId) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetMessageToBuyer(sessionId, itemId);
  }
  
  public AllegroWebApi.AddressInfoStruct[] doGetMyAddresses(java.lang.String sessionId) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetMyAddresses(sessionId);
  }
  
  public void doGetMyBidItems(java.lang.String sessionId, AllegroWebApi.SortOptionsStruct sortOptions, java.lang.String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder bidItemsCounter, AllegroWebApi.holders.ArrayOfBidItemStructHolder bidItemsList) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doGetMyBidItems(sessionId, sortOptions, searchValue, categoryId, itemIds, pageSize, pageNumber, bidItemsCounter, bidItemsList);
  }
  
  public int doGetMyCurrentShipmentPriceType(java.lang.String sessionId) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetMyCurrentShipmentPriceType(sessionId);
  }
  
  public void doGetMyData(java.lang.String sessionHandle, AllegroWebApi.holders.UserDataStructHolder userData, AllegroWebApi.holders.InvoiceDataStructHolder invoiceData, AllegroWebApi.holders.CompanyExtraDataStructHolder companyExtraData, AllegroWebApi.holders.CompanySecondAddressStructHolder companySecondAddress, AllegroWebApi.holders.PharmacyDataStructHolder pharmacyData, AllegroWebApi.holders.AlcoholDataStructHolder alcoholData, AllegroWebApi.holders.RelatedPersonsStructHolder relatedPersons) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doGetMyData(sessionHandle, userData, invoiceData, companyExtraData, companySecondAddress, pharmacyData, alcoholData, relatedPersons);
  }
  
  public void doGetMyFutureItems(java.lang.String sessionId, AllegroWebApi.SortOptionsStruct sortOptions, AllegroWebApi.FutureFilterOptionsStruct filterOptions, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder futureItemsCounter, AllegroWebApi.holders.ArrayOfFutureItemStructHolder futureItemsList) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doGetMyFutureItems(sessionId, sortOptions, filterOptions, categoryId, itemIds, pageSize, pageNumber, futureItemsCounter, futureItemsList);
  }
  
  public AllegroWebApi.UserIncomingPaymentStruct[] doGetMyIncomingPayments(java.lang.String sessionHandle, int buyerId, long itemId, long transRecvDateFrom, long transRecvDateTo, int transPageLimit, int transOffset) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetMyIncomingPayments(sessionHandle, buyerId, itemId, transRecvDateFrom, transRecvDateTo, transPageLimit, transOffset);
  }
  
  public AllegroWebApi.UserIncomingPaymentRefundsStruct[] doGetMyIncomingPaymentsRefunds(java.lang.String sessionHandle, int buyerId, long itemId, int limit, int offset) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetMyIncomingPaymentsRefunds(sessionHandle, buyerId, itemId, limit, offset);
  }
  
  public void doGetMyNotSoldItems(java.lang.String sessionId, AllegroWebApi.SortOptionsStruct sortOptions, AllegroWebApi.NotSoldFilterOptionsStruct filterOptions, java.lang.String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder notSoldItemsCounter, AllegroWebApi.holders.ArrayOfNotSoldItemStructHolder notSoldItemsList) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doGetMyNotSoldItems(sessionId, sortOptions, filterOptions, searchValue, categoryId, itemIds, pageSize, pageNumber, notSoldItemsCounter, notSoldItemsList);
  }
  
  public void doGetMyNotWonItems(java.lang.String sessionId, AllegroWebApi.SortOptionsStruct sortOptions, java.lang.String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder notWonItemsCounter, AllegroWebApi.holders.ArrayOfNotWonItemStructHolder notWonItemsList) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doGetMyNotWonItems(sessionId, sortOptions, searchValue, categoryId, itemIds, pageSize, pageNumber, notWonItemsCounter, notWonItemsList);
  }
  
  public AllegroWebApi.UserPaymentStruct[] doGetMyPayments(java.lang.String sessionId, int sellerId, long itemId, long paymentTimeFrom, long paymentTimeTo, int pageSize, int pageNumber) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetMyPayments(sessionId, sellerId, itemId, paymentTimeFrom, paymentTimeTo, pageSize, pageNumber);
  }
  
  public AllegroWebApi.PaymentsInfoStruct doGetMyPaymentsInfo(java.lang.String sessionId) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetMyPaymentsInfo(sessionId);
  }
  
  public AllegroWebApi.UserPaymentRefundsStruct[] doGetMyPaymentsRefunds(java.lang.String sessionHandle, int sellerId, long itemId, int limit, int offset) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetMyPaymentsRefunds(sessionHandle, sellerId, itemId, limit, offset);
  }
  
  public AllegroWebApi.UserPayoutStruct[] doGetMyPayouts(java.lang.String sessionHandle, long transCreateDateFrom, long transCreateDateTo, int transPageLimit, int transOffset) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetMyPayouts(sessionHandle, transCreateDateFrom, transCreateDateTo, transPageLimit, transOffset);
  }
  
  public void doGetMySellItems(java.lang.String sessionId, AllegroWebApi.SortOptionsStruct sortOptions, AllegroWebApi.SellFilterOptionsStruct filterOptions, java.lang.String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder sellItemsCounter, AllegroWebApi.holders.ArrayOfSellItemStructHolder sellItemsList) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doGetMySellItems(sessionId, sortOptions, filterOptions, searchValue, categoryId, itemIds, pageSize, pageNumber, sellItemsCounter, sellItemsList);
  }
  
  public void doGetMySellRating(java.lang.String sessionHandle, javax.xml.rpc.holders.IntHolder sellRatingTotalCount, AllegroWebApi.holders.ArrayOfSellRatingAverageStructHolder sellRatingAverage, AllegroWebApi.holders.ArrayOfSellRatingDetailStructHolder sellRatingDetails, AllegroWebApi.holders.ArrayOfSellRatingAveragePerMonthHolder sellRatingStatsPerMonth) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doGetMySellRating(sessionHandle, sellRatingTotalCount, sellRatingAverage, sellRatingDetails, sellRatingStatsPerMonth);
  }
  
  public void doGetMySoldItems(java.lang.String sessionId, AllegroWebApi.SortOptionsStruct sortOptions, AllegroWebApi.SoldFilterOptionsStruct filterOptions, java.lang.String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder soldItemsCounter, AllegroWebApi.holders.ArrayOfSoldItemStructHolder soldItemsList) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doGetMySoldItems(sessionId, sortOptions, filterOptions, searchValue, categoryId, itemIds, pageSize, pageNumber, soldItemsCounter, soldItemsList);
  }
  
  public void doGetMyWatchItems(java.lang.String sessionId, AllegroWebApi.SortOptionsStruct sortOptions, java.lang.String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder watchItemsCounter, AllegroWebApi.holders.ArrayOfWatchItemStructHolder watchItemsList) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doGetMyWatchItems(sessionId, sortOptions, searchValue, categoryId, itemIds, pageSize, pageNumber, watchItemsCounter, watchItemsList);
  }
  
  public void doGetMyWatchedItems(java.lang.String sessionId, AllegroWebApi.SortOptionsStruct sortOptions, java.lang.String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder watchedItemsCounter, AllegroWebApi.holders.ArrayOfWatchedItemStructHolder watchedItemsList) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doGetMyWatchedItems(sessionId, sortOptions, searchValue, categoryId, itemIds, pageSize, pageNumber, watchedItemsCounter, watchedItemsList);
  }
  
  public void doGetMyWonItems(java.lang.String sessionId, AllegroWebApi.SortOptionsStruct sortOptions, java.lang.String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder wonItemsCounter, AllegroWebApi.holders.ArrayOfWonItemStructHolder wonItemsList) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doGetMyWonItems(sessionId, sortOptions, searchValue, categoryId, itemIds, pageSize, pageNumber, wonItemsCounter, wonItemsList);
  }
  
  public AllegroWebApi.BillingDataType[] doGetPaymentData(int countryId, java.lang.String webapiKey) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetPaymentData(countryId, webapiKey);
  }
  
  public AllegroWebApi.PaymentMethodStruct[] doGetPaymentMethods(java.lang.String sessionId, long[] itemIds) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetPaymentMethods(sessionId, itemIds);
  }
  
  public AllegroWebApi.ItemPostBuyDataStruct[] doGetPostBuyData(java.lang.String sessionHandle, long[] itemsArray) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetPostBuyData(sessionHandle, itemsArray);
  }
  
  public AllegroWebApi.PostBuyFormForBuyersDataStruct[] doGetPostBuyFormsDataForBuyers(java.lang.String sessionId, long[] transactionsIdsArray) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetPostBuyFormsDataForBuyers(sessionId, transactionsIdsArray);
  }
  
  public AllegroWebApi.PostBuyFormDataStruct[] doGetPostBuyFormsDataForSellers(java.lang.String sessionId, long[] transactionsIdsArray) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetPostBuyFormsDataForSellers(sessionId, transactionsIdsArray);
  }
  
  public AllegroWebApi.PostBuyItemInfoStruct[] doGetPostBuyItemInfo(java.lang.String sessionId, long[] itemIds) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetPostBuyItemInfo(sessionId, itemIds);
  }
  
  public void doGetRefundsDeals(java.lang.String sessionId, AllegroWebApi.FilterOptionsType[] filterOptions, java.lang.String sortOrder, int resultSize, int resultOffset, javax.xml.rpc.holders.IntHolder dealsCount, AllegroWebApi.holders.ArrayOfRefundsDealsListTypeHolder dealsList, AllegroWebApi.holders.ArrayOfFiltersListTypeHolder filtersList) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doGetRefundsDeals(sessionId, filterOptions, sortOrder, resultSize, resultOffset, dealsCount, dealsList, filtersList);
  }
  
  public void doGetRefundsList(java.lang.String sessionId, AllegroWebApi.FilterOptionsType[] filterOptions, int resultSize, int resultOffset, javax.xml.rpc.holders.IntHolder refundsCount, AllegroWebApi.holders.ArrayOfRefundListTypeHolder refundsList, AllegroWebApi.holders.ArrayOfFiltersListTypeHolder filtersList) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doGetRefundsList(sessionId, filterOptions, resultSize, resultOffset, refundsCount, refundsList, filtersList);
  }
  
  public AllegroWebApi.RelatedItemsStruct doGetRelatedItems(java.lang.String sessionId, long[] itemIds) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetRelatedItems(sessionId, itemIds);
  }
  
  public void doGetSellFormAttribs(int countryId, java.lang.String webapiKey, long localVersion, int catId, AllegroWebApi.holders.ArrayOfSellFormsHolder sellFormFields, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doGetSellFormAttribs(countryId, webapiKey, localVersion, catId, sellFormFields, verKey, verStr);
  }
  
  public void doGetSellFormFields(int countryCode, long localVersion, java.lang.String webapiKey, AllegroWebApi.holders.ArrayOfSellFormsHolder sellFormFields, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doGetSellFormFields(countryCode, localVersion, webapiKey, sellFormFields, verKey, verStr);
  }
  
  public void doGetSellFormFieldsExt(int countryCode, long localVersion, java.lang.String webapiKey, AllegroWebApi.holders.ArrayOfSellFormsHolder sellFormFields, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doGetSellFormFieldsExt(countryCode, localVersion, webapiKey, sellFormFields, verKey, verStr);
  }
  
  public void doGetSellFormFieldsExtLimit(int countryCode, long localVersion, java.lang.String webapiKey, int offset, int packageElement, AllegroWebApi.holders.ArrayOfSellFormsHolder sellFormFields, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr, javax.xml.rpc.holders.IntHolder formFieldsCount) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doGetSellFormFieldsExtLimit(countryCode, localVersion, webapiKey, offset, packageElement, sellFormFields, verKey, verStr, formFieldsCount);
  }
  
  public AllegroWebApi.SellFormFieldsForCategoryStruct doGetSellFormFieldsForCategory(java.lang.String webapiKey, int countryId, int categoryId) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetSellFormFieldsForCategory(webapiKey, countryId, categoryId);
  }
  
  public void doGetSellFormFieldsLimit(int countryCode, long localVersion, java.lang.String webapiKey, int offset, int packageElement, AllegroWebApi.holders.ArrayOfSellFormsHolder sellFormFields, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr, javax.xml.rpc.holders.IntHolder formFieldsCount) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doGetSellFormFieldsLimit(countryCode, localVersion, webapiKey, offset, packageElement, sellFormFields, verKey, verStr, formFieldsCount);
  }
  
  public AllegroWebApi.SellRatingInfoStruct[] doGetSellRatingReasons(java.lang.String webapiKey, int countryCode) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetSellRatingReasons(webapiKey, countryCode);
  }
  
  public AllegroWebApi.ServiceInfoStruct[] doGetServiceInfo(int countryCode, int anCatId, long anItDate, int anItId, java.lang.String webapiKey) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetServiceInfo(countryCode, anCatId, anItDate, anItId, webapiKey);
  }
  
  public AllegroWebApi.ServiceInfoCatStruct[] doGetServiceInfoCategories(int countryCode, java.lang.String webapiKey) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetServiceInfoCategories(countryCode, webapiKey);
  }
  
  public AllegroWebApi.TemplateInfoType[] doGetServiceTemplates(int countryCode, java.lang.String webapiKey) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetServiceTemplates(countryCode, webapiKey);
  }
  
  public void doGetSessionHandleForWidget(java.lang.String webapiKey, int countryCode, javax.xml.rpc.holders.StringHolder sessionHandle, javax.xml.rpc.holders.LongHolder serverTime) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doGetSessionHandleForWidget(webapiKey, countryCode, sessionHandle, serverTime);
  }
  
  public void doGetShipmentData(int countryId, java.lang.String webapiKey, AllegroWebApi.holders.ArrayOfShipmentDataStructHolder shipmentDataList, javax.xml.rpc.holders.LongHolder localVersion) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doGetShipmentData(countryId, webapiKey, shipmentDataList, localVersion);
  }
  
  public AllegroWebApi.RelatedItemsShipmentDataStruct doGetShipmentDataForRelatedItems(java.lang.String sessionId, long[] itemIds) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetShipmentDataForRelatedItems(sessionId, itemIds);
  }
  
  public AllegroWebApi.ShipmentPriceTypeStruct[] doGetShipmentPriceTypes(int countryId, java.lang.String webapiKey) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetShipmentPriceTypes(countryId, webapiKey);
  }
  
  public AllegroWebApi.CatInfoType[] doGetShopCatsData(java.lang.String sessionHandle) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetShopCatsData(sessionHandle);
  }
  
  public AllegroWebApi.SiteJournal[] doGetSiteJournal(java.lang.String sessionHandle, long startingPoint, int infoType) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetSiteJournal(sessionHandle, startingPoint, infoType);
  }
  
  public AllegroWebApi.SiteJournalDealsStruct[] doGetSiteJournalDeals(java.lang.String sessionId, long journalStart) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetSiteJournalDeals(sessionId, journalStart);
  }
  
  public AllegroWebApi.SiteJournalDealsInfoStruct doGetSiteJournalDealsInfo(java.lang.String sessionId, long journalStart) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetSiteJournalDealsInfo(sessionId, journalStart);
  }
  
  public AllegroWebApi.SiteJournalInfo doGetSiteJournalInfo(java.lang.String sessionHandle, long startingPoint, int infoType) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetSiteJournalInfo(sessionHandle, startingPoint, infoType);
  }
  
  public void doGetSitesFlagInfo(int countryCode, java.lang.String webapiKey, AllegroWebApi.holders.ArrayOfSitesFlagInfoHolder sitesInfoList, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doGetSitesFlagInfo(countryCode, webapiKey, sitesInfoList, verKey, verStr);
  }
  
  public void doGetSitesInfo(int countryCode, java.lang.String webapiKey, AllegroWebApi.holders.ArrayOfSitesInfoHolder sitesInfoList, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doGetSitesInfo(countryCode, webapiKey, sitesInfoList, verKey, verStr);
  }
  
  public AllegroWebApi.SpecialAuctionStruct[] doGetSpecialItems(java.lang.String sessionHandle, int specialType, int specialGroup, int offset, int orderFulfillmentTime) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetSpecialItems(sessionHandle, specialType, specialGroup, offset, orderFulfillmentTime);
  }
  
  public AllegroWebApi.StateInfoStruct[] doGetStatesInfo(int countryCode, java.lang.String webapiKey) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetStatesInfo(countryCode, webapiKey);
  }
  
  public long doGetSystemTime(int countryId, java.lang.String webapiKey) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetSystemTime(countryId, webapiKey);
  }
  
  public long[] doGetTransactionsIDs(java.lang.String sessionHandle, long[] itemsIdArray, java.lang.String userRole, long[] shipmentIdArray) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetTransactionsIDs(sessionHandle, itemsIdArray, userRole, shipmentIdArray);
  }
  
  public int doGetUserID(int countryId, java.lang.String userLogin, java.lang.String userEmail, java.lang.String webapiKey) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetUserID(countryId, userLogin, userEmail, webapiKey);
  }
  
  public void doGetUserItems(int userId, java.lang.String webapiKey, int countryId, int offset, int limit, AllegroWebApi.holders.ArrayOfUserItemListHolder userItemList, javax.xml.rpc.holders.IntHolder userItemCount) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doGetUserItems(userId, webapiKey, countryId, offset, limit, userItemList, userItemCount);
  }
  
  public float doGetUserLicenceDate(java.lang.String sessionHandle) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetUserLicenceDate(sessionHandle);
  }
  
  public java.lang.String doGetUserLogin(int countryId, int userId, java.lang.String webapiKey) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetUserLogin(countryId, userId, webapiKey);
  }
  
  public AllegroWebApi.WaitFeedbackStruct[] doGetWaitingFeedbacks(java.lang.String sessionHandle, int offset, int packageSize) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetWaitingFeedbacks(sessionHandle, offset, packageSize);
  }
  
  public int doGetWaitingFeedbacksCount(java.lang.String sessionHandle) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doGetWaitingFeedbacksCount(sessionHandle);
  }
  
  public int doInternalIStoreChange(java.lang.String webapiKey, long userId, long istoreId, java.lang.String actionType, long actionDate, long validDate) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doInternalIStoreChange(webapiKey, userId, istoreId, actionType, actionDate, validDate);
  }
  
  public int doInternalSendMessage(java.lang.String sessionHandle, int userId, int mail_template_id, java.lang.String[] arrayOfAdditionalData) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doInternalSendMessage(sessionHandle, userId, mail_template_id, arrayOfAdditionalData);
  }
  
  public void doLogin(java.lang.String userLogin, java.lang.String userPassword, int countryCode, java.lang.String webapiKey, long localVersion, javax.xml.rpc.holders.StringHolder sessionHandlePart, javax.xml.rpc.holders.LongHolder userId, javax.xml.rpc.holders.LongHolder serverTime) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doLogin(userLogin, userPassword, countryCode, webapiKey, localVersion, sessionHandlePart, userId, serverTime);
  }
  
  public void doLoginEnc(java.lang.String userLogin, java.lang.String userHashPassword, int countryCode, java.lang.String webapiKey, long localVersion, javax.xml.rpc.holders.StringHolder sessionHandlePart, javax.xml.rpc.holders.LongHolder userId, javax.xml.rpc.holders.LongHolder serverTime) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doLoginEnc(userLogin, userHashPassword, countryCode, webapiKey, localVersion, sessionHandlePart, userId, serverTime);
  }
  
  public void doLoginWithAccessToken(java.lang.String accessToken, int countryCode, java.lang.String webapiKey, javax.xml.rpc.holders.StringHolder sessionHandlePart, javax.xml.rpc.holders.LongHolder userId, javax.xml.rpc.holders.LongHolder serverTime) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doLoginWithAccessToken(accessToken, countryCode, webapiKey, sessionHandlePart, userId, serverTime);
  }
  
  public AllegroWebApi.MyAccountStruct2[] doMyAccount2(java.lang.String sessionHandle, java.lang.String accountType, int offset, long[] itemsArray, int limit) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doMyAccount2(sessionHandle, accountType, offset, itemsArray, limit);
  }
  
  public int doMyAccountItemsCount(java.lang.String sessionHandle, java.lang.String accountType, long[] itemsArray) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doMyAccountItemsCount(sessionHandle, accountType, itemsArray);
  }
  
  public java.lang.String doMyBilling(java.lang.String sessionHandle) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doMyBilling(sessionHandle);
  }
  
  public void doMyBillingItem(java.lang.String sessionHandle, long itemId, java.lang.String option, AllegroWebApi.holders.ItemBillingListHolder entryFees, AllegroWebApi.holders.ItemBillingListHolder endingFees) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doMyBillingItem(sessionHandle, itemId, option, entryFees, endingFees);
  }
  
  public AllegroWebApi.MyContactList[] doMyContact(java.lang.String sessionHandle, long[] auctionIdList, int offset, int desc) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doMyContact(sessionHandle, auctionIdList, offset, desc);
  }
  
  public AllegroWebApi.MyFeedbackListStruct2[] doMyFeedback2(java.lang.String sessionHandle, java.lang.String feedbackType, int offset, int desc, long[] itemsArray) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doMyFeedback2(sessionHandle, feedbackType, offset, desc, itemsArray);
  }
  
  public AllegroWebApi.MyFeedbackListStruct2[] doMyFeedback2Limit(java.lang.String sessionHandle, java.lang.String feedbackType, int offset, int desc, long[] itemsArray, int packageElement) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doMyFeedback2Limit(sessionHandle, feedbackType, offset, desc, itemsArray, packageElement);
  }
  
  public void doNewAuctionExt(java.lang.String sessionHandle, AllegroWebApi.FieldsValue[] fields, int itemTemplateId, int localId, AllegroWebApi.ItemTemplateCreateStruct itemTemplateCreate, javax.xml.rpc.holders.LongHolder itemId, javax.xml.rpc.holders.StringHolder itemInfo, javax.xml.rpc.holders.IntHolder itemIsAllegroStandard) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doNewAuctionExt(sessionHandle, fields, itemTemplateId, localId, itemTemplateCreate, itemId, itemInfo, itemIsAllegroStandard);
  }
  
  public AllegroWebApi.SysStatusType[] doQueryAllSysStatus(int countryId, java.lang.String webapiKey) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doQueryAllSysStatus(countryId, webapiKey);
  }
  
  public void doQuerySysStatus(int sysvar, int countryId, java.lang.String webapiKey, javax.xml.rpc.holders.StringHolder info, javax.xml.rpc.holders.LongHolder verKey) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doQuerySysStatus(sysvar, countryId, webapiKey, info, verKey);
  }
  
  public AllegroWebApi.BlackListResStruct[] doRemoveFromBlackList(java.lang.String sessionHandle, long[] usersIdArray) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doRemoveFromBlackList(sessionHandle, usersIdArray);
  }
  
  public AllegroWebApi.ItemRemoveWatchStruct[] doRemoveFromWatchList(java.lang.String sessionHandle, long[] itemsIdArray) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doRemoveFromWatchList(sessionHandle, itemsIdArray);
  }
  
  public AllegroWebApi.RemovedItemTemplatesStruct doRemoveItemTemplates(java.lang.String sessionId, int[] itemTemplateIds) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doRemoveItemTemplates(sessionId, itemTemplateIds);
  }
  
  public int doRequestCancelBid(java.lang.String sessionHandle, long requestItemId, java.lang.String requestCancelReason) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doRequestCancelBid(sessionHandle, requestItemId, requestCancelReason);
  }
  
  public AllegroWebApi.RequestPayoutStruct doRequestPayout(java.lang.String sessionId) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doRequestPayout(sessionId);
  }
  
  public int doRequestSurcharge(java.lang.String sessionHandle, long transactionId, float surchargeValue, java.lang.String surchargeMessageToBuyer) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doRequestSurcharge(sessionHandle, transactionId, surchargeValue, surchargeMessageToBuyer);
  }
  
  public void doSearch(java.lang.String sessionHandle, AllegroWebApi.SearchOptType searchQuery, javax.xml.rpc.holders.IntHolder searchCount, javax.xml.rpc.holders.IntHolder searchCountFeatured, AllegroWebApi.holders.ArrayOfSearchResponseHolder searchArray, AllegroWebApi.holders.ArrayOfExcludedWordsHolder searchExcludedWords, AllegroWebApi.holders.ArrayOfCategoriesStructHolder searchCategories) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doSearch(sessionHandle, searchQuery, searchCount, searchCountFeatured, searchArray, searchExcludedWords, searchCategories);
  }
  
  public void doSellSomeAgain(java.lang.String sessionHandle, long[] sellItemsArray, long sellStartingTime, int sellAuctionDuration, int sellOptions, int[] localIds, AllegroWebApi.holders.ArrayOfStructSellAgainHolder itemsSellAgain, AllegroWebApi.holders.ArrayOfStructSellFailedHolder itemsSellFailed, AllegroWebApi.holders.ArrayOfItemsIDHolder itemsSellNotFound) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doSellSomeAgain(sessionHandle, sellItemsArray, sellStartingTime, sellAuctionDuration, sellOptions, localIds, itemsSellAgain, itemsSellFailed, itemsSellNotFound);
  }
  
  public void doSellSomeAgainInShop(java.lang.String sessionHandle, long[] sellItemsArray, long sellStartingTime, int sellShopDuration, int sellShopOptions, int sellProlongOptions, long sellShopCategory, int[] localIds, AllegroWebApi.holders.ArrayOfStructSellAgainHolder itemsSellAgain, AllegroWebApi.holders.ArrayOfStructSellFailedHolder itemsSellFailed, AllegroWebApi.holders.ArrayOfItemsIDHolder itemsSellNotFound) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doSellSomeAgainInShop(sessionHandle, sellItemsArray, sellStartingTime, sellShopDuration, sellShopOptions, sellProlongOptions, sellShopCategory, localIds, itemsSellAgain, itemsSellFailed, itemsSellNotFound);
  }
  
  public java.lang.String doSendEmailToUser(java.lang.String sessionHandle, long mailToUserItemId, javax.xml.rpc.holders.LongHolder mailToUserReceiverId, int mailToUserSubjectId, int mailToUserOption, java.lang.String mailToUserMessage) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doSendEmailToUser(sessionHandle, mailToUserItemId, mailToUserReceiverId, mailToUserSubjectId, mailToUserOption, mailToUserMessage);
  }
  
  public AllegroWebApi.PostBuyFormStruct doSendPostBuyForm(java.lang.String sessionId, AllegroWebApi.NewPostBuyFormSellerStruct[] newPostBuyFormSeller, AllegroWebApi.NewPostBuyFormCommonStruct newPostBuyFormCommon) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doSendPostBuyForm(sessionId, newPostBuyFormSeller, newPostBuyFormCommon);
  }
  
  public int doSetShipmentPriceType(java.lang.String sessionId, int shipmentPriceTypeId) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doSetShipmentPriceType(sessionId, shipmentPriceTypeId);
  }
  
  public int doSetUserLicenceDate(java.lang.String adminSessionHandle, java.lang.String userLicLogin, int userLicCountry, float userLicDate) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    return allegroWebApiPortType.doSetUserLicenceDate(adminSessionHandle, userLicLogin, userLicCountry, userLicDate);
  }
  
  public void doShowCat(java.lang.String sessionHandle, int catId, int catItemState, int catItemOption, AllegroWebApi.DurationTimeInfo catItemDurationOption, AllegroWebApi.FieldsValue[] catAttribFields, int catSortOptions, AllegroWebApi.PriceCatInfo catItemsPrice, int catItemsOffset, int catItemsLimit, int catOrderFulfillmentTime, AllegroWebApi.holders.ArrayOfCatInfoStructHolder catParentArray, AllegroWebApi.holders.ArrayOfCatInfoStructHolder catChildArray, AllegroWebApi.holders.ArrayOfCatInfoStructHolder catSisterArray, javax.xml.rpc.holders.IntHolder catItemsCount, javax.xml.rpc.holders.IntHolder catItemsCountFeatured, AllegroWebApi.holders.ArrayOfSearchResponseHolder catItemsArray) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doShowCat(sessionHandle, catId, catItemState, catItemOption, catItemDurationOption, catAttribFields, catSortOptions, catItemsPrice, catItemsOffset, catItemsLimit, catOrderFulfillmentTime, catParentArray, catChildArray, catSisterArray, catItemsCount, catItemsCountFeatured, catItemsArray);
  }
  
  public void doShowItemInfoExt(java.lang.String sessionHandle, long itemId, int getDesc, int getImageUrl, int getAttribs, int getPostageOptions, int getCompanyInfo, int getProductInfo, AllegroWebApi.holders.ItemInfoExtHolder itemListInfoExt, AllegroWebApi.holders.ArrayOfItemCatListHolder itemCatPath, AllegroWebApi.holders.ArrayOfItemImageListHolder itemImgList, AllegroWebApi.holders.ArrayOfAttribStructHolder itemAttribList, AllegroWebApi.holders.ArrayOfPostageStructHolder itemPostageOptions, AllegroWebApi.holders.ItemPaymentOptionsHolder itemPaymentOptions, AllegroWebApi.holders.CompanyInfoStructHolder itemCompanyInfo, AllegroWebApi.holders.ProductStructHolder itemProductInfo) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doShowItemInfoExt(sessionHandle, itemId, getDesc, getImageUrl, getAttribs, getPostageOptions, getCompanyInfo, getProductInfo, itemListInfoExt, itemCatPath, itemImgList, itemAttribList, itemPostageOptions, itemPaymentOptions, itemCompanyInfo, itemProductInfo);
  }
  
  public void doShowUser(java.lang.String webapiKey, int countryId, javax.xml.rpc.holders.LongHolder userId, javax.xml.rpc.holders.StringHolder userLogin, javax.xml.rpc.holders.IntHolder userCountry, javax.xml.rpc.holders.LongHolder userCreateDate, javax.xml.rpc.holders.LongHolder userLoginDate, javax.xml.rpc.holders.IntHolder userRating, javax.xml.rpc.holders.IntHolder userIsNewUser, javax.xml.rpc.holders.IntHolder userNotActivated, javax.xml.rpc.holders.IntHolder userClosed, javax.xml.rpc.holders.IntHolder userBlocked, javax.xml.rpc.holders.IntHolder userTerminated, javax.xml.rpc.holders.IntHolder userHasPage, javax.xml.rpc.holders.IntHolder userIsSseller, javax.xml.rpc.holders.IntHolder userIsEco, AllegroWebApi.holders.ShowUserFeedbacksHolder userPositiveFeedback, AllegroWebApi.holders.ShowUserFeedbacksHolder userNegativeFeedback, AllegroWebApi.holders.ShowUserFeedbacksHolder userNeutralFeedback, javax.xml.rpc.holders.IntHolder userJuniorStatus, javax.xml.rpc.holders.IntHolder userHasShop, javax.xml.rpc.holders.IntHolder userCompanyIcon, javax.xml.rpc.holders.IntHolder userSellRatingCount, AllegroWebApi.holders.ArrayOfSellRatingAverageStructHolder userSellRatingAverage, javax.xml.rpc.holders.IntHolder userIsAllegroStandard, javax.xml.rpc.holders.IntHolder userIsB2CSeller) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doShowUser(webapiKey, countryId, userId, userLogin, userCountry, userCreateDate, userLoginDate, userRating, userIsNewUser, userNotActivated, userClosed, userBlocked, userTerminated, userHasPage, userIsSseller, userIsEco, userPositiveFeedback, userNegativeFeedback, userNeutralFeedback, userJuniorStatus, userHasShop, userCompanyIcon, userSellRatingCount, userSellRatingAverage, userIsAllegroStandard, userIsB2CSeller);
  }
  
  public void doShowUserPage(java.lang.String webapiKey, int countryId, long userId, javax.xml.rpc.holders.StringHolder userPageContent, javax.xml.rpc.holders.StringHolder userPagePharmacyPermit, javax.xml.rpc.holders.StringHolder userPageAlcoholPermit) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doShowUserPage(webapiKey, countryId, userId, userPageContent, userPagePharmacyPermit, userPageAlcoholPermit);
  }
  
  public void doVerifyItem(java.lang.String sessionHandle, int localId, javax.xml.rpc.holders.LongHolder itemId, javax.xml.rpc.holders.IntHolder itemListed, javax.xml.rpc.holders.LongHolder itemStartingTime) throws java.rmi.RemoteException{
    if (allegroWebApiPortType == null)
      _initAllegroWebApiPortTypeProxy();
    allegroWebApiPortType.doVerifyItem(sessionHandle, localId, itemId, itemListed, itemStartingTime);
  }
  
  
}