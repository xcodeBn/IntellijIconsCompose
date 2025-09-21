package github.xcodebn.intellijiconscompose.codewithme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CwmenablecallDark: ImageVector
    get() {
        if (_CwmenablecallDark != null) return _CwmenablecallDark!!

        _CwmenablecallDark = ImageVector.Builder(
            name = "CwmenablecallDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(11f, 10f)
                lineTo(9f, 11f)
                lineTo(11f, 10f)
                horizontalLineTo(2f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _CwmenablecallDark!!
    }

private var _CwmenablecallDark: ImageVector? = null

