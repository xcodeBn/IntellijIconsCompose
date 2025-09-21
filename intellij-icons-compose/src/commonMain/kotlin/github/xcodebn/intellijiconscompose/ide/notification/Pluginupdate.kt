package github.xcodebn.intellijiconscompose.ide.notification

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Pluginupdate: ImageVector
    get() {
        if (_Pluginupdate != null) return _Pluginupdate!!

        _Pluginupdate = ImageVector.Builder(
            name = "Pluginupdate",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 4f)
                lineTo(12f, 8f)
                lineTo(4f, 8f)
                lineTo(8f, 4f)
                close()
            }
        }.build()

        return _Pluginupdate!!
    }

private var _Pluginupdate: ImageVector? = null

