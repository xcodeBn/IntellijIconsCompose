package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Models: ImageVector
    get() {
        if (_Models != null) return _Models!!

        _Models = ImageVector.Builder(
            name = "Models",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF40B6E0))
            ) {
                moveTo(2f, 14f)
                lineTo(11f, 14f)
                lineTo(11f, 5f)
                lineTo(2f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF40B6E0))
            ) {
                moveTo(11f, 4f)
                lineTo(2f, 4f)
                lineTo(4f, 2f)
                lineTo(13f, 2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF40B6E0))
            ) {
                moveTo(14f, 3f)
                lineTo(14f, 12f)
                lineTo(12f, 14f)
                lineTo(12f, 5f)
                close()
            }
        }.build()

        return _Models!!
    }

private var _Models: ImageVector? = null

