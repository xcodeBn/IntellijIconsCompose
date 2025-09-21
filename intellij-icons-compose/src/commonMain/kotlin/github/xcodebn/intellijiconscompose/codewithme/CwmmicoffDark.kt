package github.xcodebn.intellijiconscompose.codewithme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CwmmicoffDark: ImageVector
    get() {
        if (_CwmmicoffDark != null) return _CwmmicoffDark!!

        _CwmmicoffDark = ImageVector.Builder(
            name = "CwmmicoffDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFC75450))
            ) {
                moveTo(14f, 13f)
                lineTo(3f, 2f)
                verticalLineTo(8f)
                lineTo(10f, 11f)
                close()
                moveTo(13f, 8f)
                horizontalLineTo(12f)
                lineTo(13f, 10f)
                close()
                moveTo(7f, 3f)
                verticalLineTo(3f)
                lineTo(9f, 5f)
                close()
            }
        }.build()

        return _CwmmicoffDark!!
    }

private var _CwmmicoffDark: ImageVector? = null

