package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val InlineEditHovered: ImageVector
    get() {
        if (_InlineEditHovered != null) return _InlineEditHovered!!

        _InlineEditHovered = ImageVector.Builder(
            name = "InlineEditHovered",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF7F8B91)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11f, 7f)
                lineTo(9f, 5f)
                lineTo(3f, 11f)
                lineTo(3f, 13f)
                lineTo(5f, 13f)
                lineTo(11f, 7f)
                close()
                moveTo(13f, 5f)
                curveTo(13.09f, 5.25f, 13.09f, 4.59f, 12.85f, 4.34f)
                lineTo(12f, 3f)
                curveTo(11.45f, 2.94f, 10.79f, 2.94f, 10.54f, 3.19f)
                lineTo(9f, 4f)
                lineTo(12f, 7f)
                lineTo(13f, 5f)
                close()
            }
        }.build()

        return _InlineEditHovered!!
    }

private var _InlineEditHovered: ImageVector? = null

