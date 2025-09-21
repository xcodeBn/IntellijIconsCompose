package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tag: ImageVector
    get() {
        if (_Tag != null) return _Tag!!

        _Tag = ImageVector.Builder(
            name = "Tag",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(9f, 3f)
                lineTo(14f, 8f)
                lineTo(9f, 13f)
                lineTo(11f, 13f)
                lineTo(15f, 8f)
                lineTo(11f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(5f, 3f)
                lineTo(1f, 8f)
                lineTo(5f, 13f)
                lineTo(7f, 13f)
                lineTo(2f, 8f)
                lineTo(7f, 3f)
                close()
            }
        }.build()

        return _Tag!!
    }

private var _Tag: ImageVector? = null

