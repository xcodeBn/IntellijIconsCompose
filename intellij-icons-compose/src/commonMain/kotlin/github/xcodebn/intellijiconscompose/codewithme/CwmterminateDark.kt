package github.xcodebn.intellijiconscompose.codewithme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CwmterminateDark: ImageVector
    get() {
        if (_CwmterminateDark != null) return _CwmterminateDark!!

        _CwmterminateDark = ImageVector.Builder(
            name = "CwmterminateDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFC75450)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 9f)
                lineTo(12f, 6f)
                lineTo(9f, 8f)
                lineTo(13f, 12f)
                close()
            }
        }.build()

        return _CwmterminateDark!!
    }

private var _CwmterminateDark: ImageVector? = null

