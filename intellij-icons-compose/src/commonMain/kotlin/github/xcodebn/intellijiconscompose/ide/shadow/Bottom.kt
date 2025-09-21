package github.xcodebn.intellijiconscompose.ide.shadow

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bottom: ImageVector
    get() {
        if (_Bottom != null) return _Bottom!!

        _Bottom = ImageVector.Builder(
            name = "Bottom",
            defaultWidth = 4.0.dp,
            defaultHeight = 14.0.dp,
            viewportWidth = 4.0f,
            viewportHeight = 14.0f
        ).apply {

        }.build()

        return _Bottom!!
    }

private var _Bottom: ImageVector? = null

