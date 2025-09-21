package github.xcodebn.intellijiconscompose.codewithme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Cwmcamon: ImageVector
    get() {
        if (_Cwmcamon != null) return _Cwmcamon!!

        _Cwmcamon = ImageVector.Builder(
            name = "Cwmcamon",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15f, 5f)
                verticalLineTo(5f)
                close()
                moveTo(10f, 10f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(7f)
                close()
            }
        }.build()

        return _Cwmcamon!!
    }

private var _Cwmcamon: ImageVector? = null

