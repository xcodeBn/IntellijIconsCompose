package github.xcodebn.intellijiconscompose.providers

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Intersystemcache: ImageVector
    get() {
        if (_Intersystemcache != null) return _Intersystemcache!!

        _Intersystemcache = ImageVector.Builder(
            name = "Intersystemcache",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF2E2A94))
            ) {
                moveTo(7f, 3f)
                lineTo(5f, 2f)
                verticalLineTo(13f)
                lineTo(9f, 15f)
                verticalLineTo(13f)
                lineTo(7f, 12f)
                verticalLineTo(3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF00B1A9))
            ) {
                moveTo(9f, 13f)
                lineTo(11f, 14f)
                verticalLineTo(3f)
                lineTo(7f, 1f)
                verticalLineTo(3f)
                lineTo(9f, 4f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _Intersystemcache!!
    }

private var _Intersystemcache: ImageVector? = null

