package github.xcodebn.intellijiconscompose.providers

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val IntersystemcacheDark: ImageVector
    get() {
        if (_IntersystemcacheDark != null) return _IntersystemcacheDark!!

        _IntersystemcacheDark = ImageVector.Builder(
            name = "IntersystemcacheDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF4387FB))
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
                fill = SolidColor(Color(0xFF248996))
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

        return _IntersystemcacheDark!!
    }

private var _IntersystemcacheDark: ImageVector? = null

