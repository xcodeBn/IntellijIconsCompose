package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Customregion: ImageVector
    get() {
        if (_Customregion != null) return _Customregion!!

        _Customregion = ImageVector.Builder(
            name = "Customregion",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF62B543))
            ) {
                moveTo(8f, 14f)
                lineTo(3f, 9f)
                lineTo(3f, 11f)
                lineTo(8f, 15f)
                lineTo(13f, 11f)
                lineTo(13f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF62B543))
            ) {
                moveTo(8f, 1f)
                lineTo(3f, 5f)
                lineTo(3f, 7f)
                lineTo(8f, 2f)
                lineTo(13f, 7f)
                lineTo(13f, 5f)
                close()
            }
        }.build()

        return _Customregion!!
    }

private var _Customregion: ImageVector? = null

