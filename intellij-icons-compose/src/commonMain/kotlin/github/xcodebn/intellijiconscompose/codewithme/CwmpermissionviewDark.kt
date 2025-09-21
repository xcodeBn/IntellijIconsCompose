package github.xcodebn.intellijiconscompose.codewithme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CwmpermissionviewDark: ImageVector
    get() {
        if (_CwmpermissionviewDark != null) return _CwmpermissionviewDark!!

        _CwmpermissionviewDark = ImageVector.Builder(
            name = "CwmpermissionviewDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF499C54))
            ) {
                moveTo(8f, 4f)
            }
        }.build()

        return _CwmpermissionviewDark!!
    }

private var _CwmpermissionviewDark: ImageVector? = null

