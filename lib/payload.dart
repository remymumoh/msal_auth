import 'package:msal_mobile/account.dart';

class MsalMobileResultPayload {}

class MsalMobileGetAccountResultPayload extends MsalMobileResultPayload {
  final MsalMobileAccount? currentAccount;  // Made this nullable
  final bool accountLoaded;

  MsalMobileGetAccountResultPayload.fromJson(Map<String, dynamic> json)
      : currentAccount = json['currentAccount'] != null
      ? MsalMobileAccount.fromJson(
      json['currentAccount'] as Map<String, dynamic>)
      : null,  // Set this to null if 'currentAccount' is not present in the JSON
        accountLoaded = json['accountLoaded'];
}


class MsalMobileAuthenticationResultPayload extends MsalMobileResultPayload {
  final bool cancelled;
  final bool success;
  final String accessToken;
  final String tenantId;
  final List<dynamic> scope;
  final String expiresOn;

  MsalMobileAuthenticationResultPayload.fromJson(Map<String, dynamic> json)
      : cancelled = json['cancelled'],
        success = json['success'],
        accessToken = json['accessToken'],
        tenantId = json['tenantId'],
        scope = json['scope'] != null
            ? json['scope'] as List<dynamic>
            : <dynamic>[],
        expiresOn = json['expiresOn'] != null ? json['expiresOn'] : null;
}
